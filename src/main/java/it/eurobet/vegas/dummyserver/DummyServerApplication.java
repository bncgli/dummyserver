package it.eurobet.vegas.dummyserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DummyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummyServerApplication.class, args);
    }

}
