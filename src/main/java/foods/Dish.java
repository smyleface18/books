/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foods;

import values.DishTypes;
import values.DishVaration;

/**
 *
 * @author SCIS2PC08
 */
public class Dish {
    
    DishTypes type;
    int stock;
    int price;
    DishVaration variation;

    public Dish(DishTypes type, int stock, int price, DishVaration variation) {
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.variation = variation;
    }

    public Dish() {
        
    }

    public DishTypes getType() {
        return type;
    }

    public void setType(DishTypes type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DishVaration getVariation() {
        return variation;
    }

    public void setVariation(DishVaration variation) {
        this.variation = variation;
    }
    
    
    
    
    
}
