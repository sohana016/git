/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Product {
    int id;
    String name;
    int qunatity;
    float price;
    float pricePercent;

    public Product() {
    }

    public Product(int id, String name, int qunatity, float price, float pricePercent) {
        this.id = id;
        this.name = name;
        this.qunatity = qunatity;
        this.price = price;
        this.pricePercent = pricePercent;
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

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPricePercent() {
        return pricePercent;
    }

    public void setPricePercent(float pricePercent) {
        this.pricePercent = pricePercent;
    }
    
    
    
}
