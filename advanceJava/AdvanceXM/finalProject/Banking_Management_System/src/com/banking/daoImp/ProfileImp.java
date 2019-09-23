/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.daoImp;

import com.banking.connection.DBConnection;
import com.banking.pojo.Account;
import com.banking.pojo.Profile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Md Yasin Arif
 */
public class ProfileImp {
    Connection con = DBConnection.getConnet();
    public void update(Profile a){
        String sql = "update newaccount set Name = ?, Dath_of_Birth=?,Nationality=?,Gender=?,Address=?,Account_Type=?,Caste=?,Mobile_No=?,Sequrite_Qsn=? where AccountNo = ?";
        try {
            
            PreparedStatement pst = con.prepareStatement(sql);
           
            pst.setString(1,a.getName());
            pst.setString(2,a.getDate_of_birth());
            pst.setString(3,a.getNationality());
            pst.setString(4,a.getGender());
            pst.setString(5,a.getAddress());
           
           pst.setString(6,a.getAcc_type());
           
            
            
            pst.setString(7,a.getCaste());
            pst.setInt(8,a.getMobile());
            pst.setString(9,a.getSeq_qsn());
            pst.setString(10,a.getAcc_no());
           
           
            pst.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Data update");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data is not update");
            e.printStackTrace();
        }
    }
}
