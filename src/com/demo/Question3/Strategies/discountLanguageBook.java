package com.demo.Question3.Strategies;

public class discountLanguageBook extends Discount{
    @Override
    public void calculator(double price) {
        System.out.println("Language Book, " + (price - 5));
    }
}
