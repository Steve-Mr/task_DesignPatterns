package com.demo.Question3.Strategies;

public class discountComputerBook extends Discount{
    @Override
    public void calculator(double[] prices) {
        double sum = 0.0;
        for (double price: prices){
            price *= 0.75;
            sum += price;
        }
        System.out.println("计算机类图书总价, " + sum);
    }
}
