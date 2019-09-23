/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalev;

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
public class Repesitory {

    public Repesitory() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(Repesitory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
    }
    public ArrayList<Product> loadProducts(){
         ArrayList<Product> products = new ArrayList<>();
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root", "");
            Statement st = con.createStatement();
            ResultSet rs  = st.executeQuery("select id,name,quantity,price from product");
            while(rs.next()){
                products.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
            
            }
            rs.close();
            st.close();
            con.close();
            
        } catch (SQLException ex) {
           // Logger.getLogger(Repesitory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
         
            
    return products;
    }
   public void update(int id,int quantity){
        try {
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root", "");
            PreparedStatement pst = con.prepareStatement("update product set quantity = ? where id = ?");
            pst.setInt(1, quantity);
            pst.setInt(2, id);
            int result = pst.executeUpdate();
            pst.close();
            con.close();
        } catch (SQLException ex) {
           // Logger.getLogger(Repesitory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
   
   
   
   }
    
}
