package com.demo.Question2.observers;

public class Buyer implements Observer{
    String name;

    public Buyer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double percent, double price) {
        int per = percent > 0 ? 5 : -5;
        System.out.println("您好" + name +"， 您购买的 " + stockName + "股票，当前价格变化幅度达到" + per +"%，当前价格为：" + price);
    }
}
