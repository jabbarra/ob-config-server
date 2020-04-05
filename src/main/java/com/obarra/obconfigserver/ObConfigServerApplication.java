package com.obarra.obconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ObConfigServerApplication {

    /**
     * Principal entry point of Spring Boot Applications.
     * @param args receives values of executor
     */
    public static void main(final String[] args) {
        SpringApplication.run(ObConfigServerApplication.class, args);
    }

}
