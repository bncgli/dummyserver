package it.eurobet.vegas.dummyserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
@EnableAdminServer
public class DummyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyServerApplication.class, args);
    }

}
