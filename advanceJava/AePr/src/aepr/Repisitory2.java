/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aepr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Repisitory2 {

    public Repisitory2() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            
            
           // Logger.getLogger(Repisitory2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
                    
    }
    
     public ArrayList<Product2> loadProducts(){
                ArrayList<Product2> products = new ArrayList<>();
         
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmim","root","");
            Statement stm= con.createStatement();
            ResultSet rs = stm.executeQuery("select id,name,quantity,price from product");
            while(rs.next()){
                products.add(new Product2(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
            
            }
            rs.close();
            stm.close();
            con.close();
            
            
        } catch (SQLException ex) {
           // Logger.getLogger(Repisitory2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
     
     return products;
     }
        
    public void updateProduct(int id,int quantity ){
       
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmim","root","");
            PreparedStatement pstm = con.prepareStatement("update product set quantity = ? where id = ?");
            pstm.setInt(1,quantity);
            pstm.setInt(2, id);
            int result = pstm.executeUpdate();
            pstm.close();
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(Repisitory2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println( ex.getMessage());
        }
        
    
    }
    
}
