package com.toy.motobike.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author LAP11292-local
 */
@SpringBootApplication
@ComponentScan("com.toy.motobike.controller")
public class SpringBootRestApiApp {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(SpringBootRestApiApp.class, args);
        System.out.println(ctx.getDisplayName());
        
        System.out.println("Restart my service is success");

    }
}
