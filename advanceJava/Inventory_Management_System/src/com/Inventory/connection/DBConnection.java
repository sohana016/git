/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inventory.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Java
 */
public class DBConnection {
    public static Connection con = null;
    public static Connection getConnet(){
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "root");
            System.out.println("Connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    return con;
    }  
    
}
