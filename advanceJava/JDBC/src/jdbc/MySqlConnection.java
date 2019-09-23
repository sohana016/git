/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author User
 */
public class MySqlConnection {
    public void startMysql(){
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tawhida","tawhida","1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("insert into test values()");
            while(rs.next()){
                    System.out.println(rs.getInt(1)+" "+rs.getInt(2));
            }
            con.close();
            }catch(Exception e){
                System.out.println(e);
            }
    }
    
}
