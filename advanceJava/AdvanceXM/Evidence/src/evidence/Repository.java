/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence;

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
public class Repository {

    public Repository() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int insert(String name, int qty, float price) {
        int result = 0;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.15:3306/j2ee","test","1234");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO product ( name, quantity, price) VALUES(?,?,?);");
            stmt.setString(1, name);
            stmt.setInt(2, qty);
            stmt.setFloat(3, price);
            result = stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error in insert"+e.getMessage());
            return result;
        }
        return result;
    }
    public ArrayList<Product> loadProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.15:3306/j2ee","test","1234");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("SELECT id, name, quantity,price,pricePercent FROM product");
            while (result.next()) {                
                products.add(new Product(result.getInt(1), result.getString(2), result.getInt(3), result.getFloat(4), result.getFloat(5)));
            }
            result.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
            return products;
        }
        
        return products;
    }
    public void updateProduct(int id, int qty) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.15:3306/j2ee","test","1234");
            PreparedStatement stmt = con.prepareStatement("UPDATE product SET quantity=? WHERE id=?");
            stmt.setInt(1, qty);
            stmt.setInt(2, id);
            int result = stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
    
}
