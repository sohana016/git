package com.inventory.imp;


import com.Inventory.connection.DBConnection;
import com.Inventory.pojo.CustomerList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class RepositoryImp {

    Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        RepositoryImp obj = new RepositoryImp();
        obj.createTable();
    }
    public void createTable() {
        String sql = "create table if not Exists newcustomer(Id int(4) auto_increment primary key,Name varchar(60),MobileNo varchar(20),Email varchar(60),Date varchar(30))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insetCust(CustomerList c){
        String sql = "insert into newcustomer(Name,MobileNo,Email,Date) values(?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,c.getName());
            pstm.setString(2, c.getMobileNo());
            pstm.setString(3, c.getEmail());
            pstm.setString(4, c.getDate());
            pstm.executeUpdate();
             JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            //Logger.getLogger(RepositoryImp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data is not Save");
            ex.printStackTrace();
        }
            
    }
    public CustomerList getCustomerInfo(){
       // List<CustomerList> list = new ArrayList<>();
        CustomerList c =null;
        String sql = "select * from newcustomer";
        try {
             PreparedStatement pstm = con.prepareStatement(sql);
              ResultSet rs = pstm.executeQuery();
              while(rs.next()){
                   c = new CustomerList(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                   
              
              }
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        return c;
    
    
    }
    public List<CustomerList> getCustomerdisplay(){
        List<CustomerList> list = new ArrayList<>();
       
        String sql = "select * from newcustomer";
        try {
             PreparedStatement pstm = con.prepareStatement(sql);
              ResultSet rs = pstm.executeQuery();
              while(rs.next()){
                   CustomerList customerList = new CustomerList(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                   list.add(customerList);
              
              }
            
        } catch (Exception e) {
           e.printStackTrace();
        }
        
        return list;
    
    
    }
    
    
    
    
    public void updateCust(CustomerList c){
    
        String sql  = "update newcustomer set Name = ?,MobileNo = ?, Email = ? Date = ?";
    
    }
    
    
    
    }
    
    
   

