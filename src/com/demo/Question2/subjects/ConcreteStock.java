package com.demo.Question2.subjects;

import com.demo.Question2.observers.Buyer;

public class ConcreteStock extends Stock {

    public ConcreteStock(String stockName) {
        super(stockName);
    }

    @Override
    public void alert(double price) {
        this.price = price;
        if (peak == 0.0) peak = price;
        if (pre_price == 0.0) pre_price = price;
        // 若 peak 和 pre_price 值为 0.0，则尚未赋值

        if (price >= peak){
            if (FLAG){
                //股价持续上涨，判断当前价格与最低点差距
                percent = judge(price, peak);
            }
            else {
                //股价由跌转涨，判断当前价格与最低点（pre_price）差距，更新 peak
                FLAG = true;
                peak = pre_price;
                percent = judge(price, pre_price);
            }
        }
        else if (FLAG){
            //股价由张转跌，判断当前价格与最高点（pre_price），差距，更新 peak
            FLAG = false;
            peak = pre_price;
            percent = judge(price, pre_price);
        }
        else {
            //股价持续下跌，计算当前价格与最高点差距
            percent = judge(price, peak);
        }
    }

    /**
     * 计算价格变化幅度
     * 更新 pre_price 值
     * 若价格变化幅度超过 5% 则通知购买者
     * */
    double judge(double price, double base){
        double percent = (price - base)/base;
        pre_price = price;
        if (percent >= 0.05 || percent <= -0.05){
            peak = price;
            for(Object buyer : observers){
                ((Buyer) buyer).update(this);
            }
        }
        return percent;
    }
}
