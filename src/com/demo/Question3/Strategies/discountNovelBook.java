package com.demo.Question3.Strategies;

public class discountNovelBook extends Discount{
    @Override
    public void calculator(double price) {
        System.out.println("Novel Book, " + (price - ((int)(price / 100) * 20)));
    }
}
