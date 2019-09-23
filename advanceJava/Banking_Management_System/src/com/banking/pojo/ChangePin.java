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
public class ChangePin {
    int id;
    String old_pin;
    String new_pin;
    
    
    public ChangePin() {
    }
    
    public ChangePin(int id, String old_pin, String new_pin) {
        this.id = id;
        this.old_pin = old_pin;
        this.new_pin = new_pin;
    }

    public ChangePin(String old_pin, String new_pin) {
        this.old_pin = old_pin;
        this.new_pin = new_pin;
    }

                    
        public int getId() {
        return id;
    }

    
    public String getOld_pin() {
        return old_pin;
    }

    public String getNew_pin() {
        return new_pin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOld_pin(String old_pin) {
        this.old_pin = old_pin;
    }

    public void setNew_pin(String new_pin) {
        this.new_pin = new_pin;
    }
    
     

    

   
    
}
