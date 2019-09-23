/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author User
 */
public class PreparedStatement {
    public void synsmicStatement(){
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
                             
        }catch(Exception e){
            System.out.println(e);
            
        }
    
    }
    
}
