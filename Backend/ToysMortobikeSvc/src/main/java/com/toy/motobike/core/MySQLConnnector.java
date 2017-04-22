package com.toy.motobike.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author VuongTM
 */
public class MySQLConnnector {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static Connection conn;

    private MySQLConnnector() {}
    
    /**
     * 
     * @param url
     * @param user
     * @param pass
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    private static void initConnection(String url, String user, String pass) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connect DB MySQL successful !");
    }

    /**
     * 
     * @param url
     * @param user
     * @param pass
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Connection getConnection(String url, String user, String pass) throws ClassNotFoundException, SQLException {
        if (null == conn) {
            initConnection(url, user, pass);
        }
        return conn;
    }
    
}
