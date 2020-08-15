package com.email.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.email.service"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
