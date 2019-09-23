/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author User
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        // TODO code application logic here
//        try{
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
//          Statement stmt = con.createStatement();
//          ResultSet rs = stmt.executeQuery("select * from DEPARTMENTS");
//           while(rs.next()){
//               
//               System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
//           }
//           con.close();
//            
//        }catch(Exception e){
//                System.out.println(e);
//        
//        
//        }
            MySqlConnection con = new MySqlConnection();
                con.startMysql();
    }
    
}
