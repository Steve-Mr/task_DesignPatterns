package com.demo.Question2.subjects;

import com.demo.Question2.observers.Observer;

import java.util.ArrayList;

public abstract class Stock {

    protected String stockName;
    protected ArrayList<Observer> observers = new ArrayList<>();
    protected double peak = 0.0;
    protected double pre_price = 0.0;
    protected double price;
    protected boolean FLAG = true;
    protected double percent;
    /*
     * peak: 极值点（极大和极小）
     * pre_price：上一次输入价格
     * FLAG: true 上升趋势，false 下降趋势
     */

    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPercent() {
        return percent;
    }

    public double getPrice(){
        return this.price;
    }

    //注册方法
    public void buy(Observer observer){
        observers.add(observer);
    }

    //注销方法
    public void sell(Observer observer){
        observers.remove(observer);
    }

    public abstract void alert(double price);
}
