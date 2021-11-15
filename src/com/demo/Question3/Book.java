package com.demo.Question3;

import com.demo.Question3.Strategies.Discount;

public class Book {
    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void calculatePrice(){
        discount.calculator(this.price);
    }


}
