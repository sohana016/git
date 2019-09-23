/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.pojo;

/**
 *
 * @author Md Yasin Arif
 */
public class Summary {
    int id;
    String name;
    String acc_no;
    double balance;
    
   

    public Summary() {
    }

    public Summary(String acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    

   

    

    public Summary(String name, String acc_no, double balance) {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public Summary(int id, String acc_no, double balance) {
        this.id = id;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public Summary(int id, String name, String acc_no, double balance) {
        this.id = id;
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    

   

    
    
    
}
