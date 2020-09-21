package com.example.APIREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class ApirestApplication {
//teste githu b
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("main");
        SpringApplication.run(ApirestApplication.class, args);

        logger.info("Service online!");
    }
}