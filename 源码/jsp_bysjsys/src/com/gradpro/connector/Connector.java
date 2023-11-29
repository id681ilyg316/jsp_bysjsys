package com.gradpro.connector;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;

public class Connector {
    
    private static final String URL = "jdbc:mysql://www.icodedock.com:3306/bysjsys?useSSL=false&serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&allowPublicKeyRetrieval=true";
    private static final String USER_NAME = "bysjsys";
    private static final String PASSWORD = "bysjsys";
    
    public Connector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("--链接数据库失败。" + e);
        }
    }
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void closeResultSet(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void closePreparedStatement(PreparedStatement ps) {
        try {
            ps.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
