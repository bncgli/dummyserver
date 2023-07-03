package it.eurobet.vegas.dummyserver.procedures;


import java.sql.Clob;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class StoredProcedures {

    public static String test_procedure(String msg){
        return "HELLO! " + msg;
    }

    public static Map<String, Object> input_reader(Clob in, int out){
        System.out.println(in);
        Map<String, Object> m = new HashMap<>();
        m.put("O_RITORNO",0);
        return m;
    }


}
