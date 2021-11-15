package com.demo.Question2.subjects;

import com.demo.Question2.observers.Buyer;
import com.demo.Question2.observers.Observer;

import java.util.Arrays;

public class ConcreteStock extends Stock {

    public ConcreteStock(String stockName) {
        super(stockName);
    }

    @Override
    public void alert(double price) {
        if (peak == 0.0) peak = price;
        if (pre_price == 0.0) pre_price = price;
        if (price >= peak){
            if (FLAG){
                percent = judger(price, peak);
            }
            else {
                FLAG = !FLAG;
                peak = pre_price;
                percent = judger(price, pre_price);
            }
        }
        else if (FLAG){
            FLAG = !FLAG;
            peak = pre_price;
            percent = judger(price, pre_price);
        }
        else {
            percent = judger(price, peak);
        }
    }

    double judger(double price, double base){
        double percent = (price - base)/base;
        pre_price = price;
        if (percent >= 0.05 || percent <= -0.05){
            peak = price;
            for(Object buyer : observers){
                ((Buyer) buyer).update(stockName, percent, price);
            }
        }
        return percent;
    }
}
