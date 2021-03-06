/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.daoImp;

import com.banking.connection.DBConnection;
import com.banking.pojo.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Md Yasin Arif
 */
public class SummaryImp {

    Connection con = DBConnection.getConnet();

    public static void main(String[] args) {
        SummaryImp obj = new SummaryImp();
        obj.createTable();
        int id;

    }

    public void createTable() {
        String sql = "create table if not Exists summary(id int(4) auto_increment primary key, AccountNo varchar(20)unique, Name varchar(40), AvlBalance Double,DepAmount Double,WithAmount Double,TotalAmount Double)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Summary s) {
        String sql = "insert into summary(AccountNo,Name,AvlBalance) values (?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, s.getAcc_no());
            pst.setString(2, s.getName());
            pst.setDouble(3, s.getAvailavle_blnce());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void updateForDep (Summary s) {
        String sql = "update  summary set DepAmount=? where AccountNo=? ";

        try {
            PreparedStatement pst = con.prepareStatement(sql);
           
            
            pst.setDouble(1, s.getDeposite_amount());
             pst.setString(2, s.getAcc_no());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public Double getDeposit() {
        Double totalDeposit = 0.0;
        String sql = "SELECT sum(TotalAmount) FROM summary";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                totalDeposit = rs.getDouble(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalDeposit;
    }
    
    public Summary getSummaryByAccountNo(String accountNo){
        Summary summary = null;
     String sql = "select * from summary where AccountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                summary = new Summary(rs.getString(3), rs.getString(2), rs.getDouble(4));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summary;
    }
}
