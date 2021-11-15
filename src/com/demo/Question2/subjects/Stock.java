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

    public Stock(String stockName) {
        this.stockName = stockName;
    }

    public void setStockName(String stockName){
        this.stockName = stockName;
    }

    public double getPeak() {
        return peak;
    }

    public void setPeak(double peak) {
        this.peak = peak;
    }

    public double getPre_price() {
        return pre_price;
    }

    public void setPre_price(double pre_price) {
        this.pre_price = pre_price;
    }

    public String getStockName(){
        return this.stockName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void buy(Observer observer){
        observers.add(observer);
    }

    public void sell(Observer observer){
        observers.remove(observer);
    }

    public abstract void alert(double price);
}
