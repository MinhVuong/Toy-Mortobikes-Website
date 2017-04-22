package com.toy.motobike.dao;

import com.toy.motobike.core.MySQLConnnector;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author VuongTM
 */
public class UserDao {
    private final static String SP_GET_LIST_RULE = "{CALL SP_GET_LIST_RULES()}";
    
    private final Connection conn;

    public UserDao(Connection conn) {
        this.conn = conn;
    }
    
    public void getListRule() {
        try{
            CallableStatement stmt = conn.prepareCall(SP_GET_LIST_RULE);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("id: " + id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
