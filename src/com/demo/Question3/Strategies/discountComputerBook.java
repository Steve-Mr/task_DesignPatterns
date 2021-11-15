package com.demo.Question3.Strategies;

public class discountComputerBook extends Discount{
    @Override
    public void calculator(double price) {
        System.out.println("Computer Book, " + price * 0.75);
    }
}
