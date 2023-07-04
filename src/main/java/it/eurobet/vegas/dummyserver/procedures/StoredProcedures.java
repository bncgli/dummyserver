package it.eurobet.vegas.dummyserver.procedures;


import com.mysql.cj.jdbc.Clob;
import org.h2.result.SimpleResult;
import org.h2.tools.SimpleResultSet;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

public class StoredProcedures {

    public static String test_procedure(String msg) {
        return "HELLO! " + msg;
    }

    public static SimpleResultSet store_procedure(String in) {
        SimpleResultSet r = new SimpleResultSet();
        r.addColumn("O_RITORNO", Types.NUMERIC,100,0);
        r.addRow(0);
        return r;
    }

    public static SimpleResultSet get_config(BigDecimal in, Clob out1, BigDecimal out2) {
        SimpleResultSet r = new SimpleResultSet();
        r.addColumn("o_game_config_json", Types.VARCHAR, 255, 0);
        r.addColumn("O_RITORNO", Types.VARCHAR, 255, 0);
        r.addRow("", 0);
        return r;
    }


}
