/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence;

/**
 *
 * @author User
 */
public class Product {
    private int id;
    private String name;
    private int quantity;
    private float price;
    private float pricePercent;

    public Product() {
    }

    public Product(int id, String name, int quantity, float price, float pricePercent) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
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

    public float getPricePercent() {
        return pricePercent;
    }

    public void setPricePercent(float pricePercent) {
        this.pricePercent = pricePercent;
    }
    
    
}
