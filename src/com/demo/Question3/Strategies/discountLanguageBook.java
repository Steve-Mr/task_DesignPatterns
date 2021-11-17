package com.demo.Question3.Strategies;

public class discountLanguageBook extends Discount{
    @Override
    public void calculator(double[] prices) {
        double sum = 0.0;
        for (double price: prices){
            price -=5;
            sum += price;
        }
        System.out.println("语言类图书总价, " + sum);
    }
}
