/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Product1 {
    int id;
    String item;
    int quantity;
    float price;
    float pricePercentes;
    
    public Product1() {
        
    }

    public Product1(int id, String item, int quantity, float price, float pricePercentes) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.pricePercentes = pricePercentes;
    }

    public Product1(String item, int quantity, float price, float pricePercentes) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.pricePercentes = pricePercentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPricePercentes() {
        return pricePercentes;
    }

    public void setPricePercentes(float pricePercentes) {
        this.pricePercentes = pricePercentes;
    }
    
    
}
