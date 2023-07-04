package it.eurobet.vegas.dummyserver.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.h2.tools.Server;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DbConfiguration {

    String tcpPort;

    public DbConfiguration(@Value("${spring.h2.tcp_port}") String tcpPort) {
        this.tcpPort = tcpPort;
    }


    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseaServer() throws SQLException {
        System.out.println("Enter tcp server creation");
        Server tcpServer = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", tcpPort);

        return tcpServer;
    }

}
