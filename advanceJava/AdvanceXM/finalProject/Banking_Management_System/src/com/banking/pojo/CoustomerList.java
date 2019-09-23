/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.pojo;

import java.util.Date;

/**
 *
 * @author Md Yasin Arif
 */
public class CoustomerList {
    int id;
    int acc;
    String name;
    Date date_of_birth;
    String acc_type;
    String gender;
    int mob;

    public CoustomerList() {
    }

    public CoustomerList(int id, int acc, String name, Date date_of_birth, String acc_type, String gender, int mob) {
        this.id = id;
        this.acc = acc;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.acc_type = acc_type;
        this.gender = gender;
        this.mob = mob;
    }

    public CoustomerList(int acc, String name, Date date_of_birth, String acc_type, String gender, int mob) {
        this.acc = acc;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.acc_type = acc_type;
        this.gender = gender;
        this.mob = mob;
    }

    public int getId() {
        return id;
    }

    public int getAcc() {
        return acc;
    }

    public String getName() {
        return name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public String getGender() {
        return gender;
    }

    public int getMob() {
        return mob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }
    
    
    
}
