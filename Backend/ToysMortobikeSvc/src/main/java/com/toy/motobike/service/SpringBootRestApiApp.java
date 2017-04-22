package com.toy.motobike.service;

import com.toy.motobike.core.MySQLConnnector;
import com.toy.motobike.dao.UserDao;
import java.sql.Connection;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
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
    
    @Value("${mysql.url}")
    private String mySqlUrl;
    
    @Value("${mysql.user}")
    private String mySqlUser;
    
    @Value("${mysql.pass}")
    private String mySqlUame;
    
    @Bean
    public UserDao initUserDao() {
        try{
            return new UserDao(MySQLConnnector.getConnection(mySqlUrl, mySqlUser, mySqlUame));
        } catch (ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
}
