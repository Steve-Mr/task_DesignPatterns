package com.demo.Question3;

import com.demo.Question3.Strategies.Discount;

public class Book {
    private double price;
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    //调用折扣类的计价方法
    public void calculatePrice(){
        discount.calculator(this.price);
    }


}
