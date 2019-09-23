
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Repository {

    public Repository()  {
        try {
             Class.forName("com.mysql.jdbc.Driver");      

        } catch (ClassNotFoundException ex) {
            
        }
        
                 
    }
    //public ArrayList<Product> insert(ArrayList<Product> products){
    
    
        public int insert(String name,int quantity,float price){
            int result = 0; 
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sohana","root","root");
            PreparedStatement pst = con.prepareStatement("insert into product(Name,Quantity,Price) values(?,?,?)");
                pst.setString(1, name);
                pst.setInt(2, quantity);
                pst.setFloat(3, price);
                result = pst.executeUpdate();
                
        } catch (Exception e) {
            System.out.println("error in insert "+ e.getMessage());
            return result;
        }
        return result;
    }
 
        public  ArrayList<Product> loadProducts(){
                ArrayList<Product> products = new ArrayList<>();
                
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sohana","root","root");
                Statement stmt = con.createStatement();
                ResultSet result = stmt.executeQuery("select Id,Name,Quantity,Price from product");
                while(result.next()){
                products.add(new Product(result.getInt(1),result.getString(2),result.getInt(3),result.getFloat(4)));
                
                }
                result.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Error "+e.getMessage());
                
            }
        return products;
        }
        
        public void updateProduct(int id,int quantity){
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sohana","root","root");
                PreparedStatement pst = con.prepareStatement("update product set Quantity = ? where Id = ?");
                pst.setInt(1, quantity);
                pst.setInt(2, id);
                int ressult  = pst.executeUpdate();
                pst.close();
                con.close();
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        
        
        }
}
