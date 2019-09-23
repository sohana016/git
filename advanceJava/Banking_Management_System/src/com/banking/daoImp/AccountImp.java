/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.daoImp;

import com.banking.connection.DBConnection;
import com.banking.pojo.Account;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Md Yasin Arif
 */
public class AccountImp {
    Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        AccountImp obj = new AccountImp();
        obj.createTable();
    }
    public void createTable() {
        String sql = "create table if not Exists newaccount(id int(4) auto_increment primary key,AccountNo varchar(20)unique,MICR_No varchar(50),Pin int(15),Account_Type varchar(20),Gender varchar(10),Address varchar(30),Amount Double,Name varchar(40),Dath_of_Birth varchar(20),Nationality varchar(30),Caste varchar(100),Mobile_No int(20),Sequrite_Qsn varchar(100),Ans varchar(100))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    
    public void save(Account a){
        String sql = "insert into newaccount(AccountNo ,MICR_No ,Pin ,Account_Type ,Gender,Address,Amount ,Name,Dath_of_Birth,Nationality,Caste,Mobile_No,Sequrite_Qsn,Ans)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, a.getAccout_no());
            pst.setString(2, a.getMicr_no());
            pst.setInt(3,a.getPin());
            pst.setString(4, a.getAccount_type());
            pst.setString(5,a.getGender());
            pst.setString(6,a.getAddress());
            pst.setDouble(7, a.getAmount());
            pst.setString(8,a.getName());
            pst.setString(9,a.getDate_of_birth());
            pst.setString(10,a.getNationality());
            pst.setString(11,a.getCaste());
            pst.setInt(12,a.getMobile());
            pst.setString(13,a.getSequirity_qsn());
            pst.setString(14,a.getAns());
           
            pst.executeUpdate();   
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data is not Save");
            e.printStackTrace();
        }
    }
     //show
    public Account getPersoninfoByAccontNo(String accountNo) {
        Account a = null;
        String sql = "select * from newaccount where AccountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                a = new Account(rs.getString(2), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getInt(13),rs.getString(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
    
    //update
    
    
    }
    
