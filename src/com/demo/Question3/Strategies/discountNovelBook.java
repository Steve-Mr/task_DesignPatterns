package com.demo.Question3.Strategies;

public class discountNovelBook implements Discount{
    @Override
    public void calculator(double[] prices) {
        double sum = 0.0;
        for(double price: prices){
            sum += price;
        }
        System.out.println("文艺小说类图书总价, " + (sum - ((int)(sum / 100) * 20)));
    }
}
