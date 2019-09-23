/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence;


public class Product {
    private int id;
    private String item;
    private int quantity;
    private float price;
    private float pricePrecent;
    
    public Product() {
    }

    public Product(int id, String item, int quantity, float price, float pricePrecent) {
        this.id = id;
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.pricePrecent = pricePrecent;
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

    public float getPricePrecent() {
        return pricePrecent;
    }

    public void setPricePrecent(float pricePrecent) {
        this.pricePrecent = pricePrecent;
    }

    

    
   
    
}
