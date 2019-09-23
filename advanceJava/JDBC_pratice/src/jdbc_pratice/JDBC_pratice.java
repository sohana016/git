/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_pratice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.net.aso.r;



/**
 *
 * @author User
 */
public class JDBC_pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
               
       try{
           
           
           
           Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
         Statement stmt= con.createStatement();
         ResultSet rs=stmt.executeQuery("select * from EMPLOYEES");  
                while(rs.next()) {
                     EMPLOYEES e = new EMPLOYEES();
                     e.setFIRST_NAME(rs.getString(2));
                  ArrayList<EMPLOYEES> r = new ArrayList<>();
                r.add(e);
                    System.out.println(e);
                }
       con.close();
       }    catch(Exception e){
       System.out.println(e);
       
    }
 
       

    }
    
}
