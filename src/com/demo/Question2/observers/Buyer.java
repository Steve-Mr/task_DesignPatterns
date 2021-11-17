package com.demo.Question2.observers;

import com.demo.Question2.subjects.Stock;

public class Buyer implements Observer{
    String name;

    public Buyer(String name){
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        int per = stock.getPercent() > 0 ? 5 : -5;
        System.out.println("您好" + name +"， 您购买的 " + stock.getStockName() + "股票，当前价格变化幅度达到" + per +"%，当前价格为：" + stock.getPrice());
    }
}
