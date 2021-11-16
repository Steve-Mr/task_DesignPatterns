package com.demo.Question2;

import com.demo.Question2.observers.Buyer;
import com.demo.Question2.observers.Observer;
import com.demo.Question2.subjects.ConcreteStock;
import com.demo.Question2.subjects.Stock;

import java.util.Arrays;
import java.util.List;

/**
 * 某在线股票软件需要提供如下功能：
 * 当股票购买者购买的某只股票价格变化幅度达到5%时，
 * 系统将自动发送通知（包括新价格）给购买该股票的股民。
 * 现使用观察者模式设计该系统。
 * */
public class Client {
    public static void main(String[] args) {
        Stock AAPL;
        AAPL = new ConcreteStock("AAPL");

        Observer buyer1,buyer2,buyer3;
        buyer1 = new Buyer("张三");
        AAPL.buy(buyer1);
        buyer2 = new Buyer("李四");
        AAPL.buy(buyer2);
        buyer3 = new Buyer("王五");
        AAPL.buy(buyer3);

        List<Integer> priceList =
                Arrays.asList(100, 105, 100, 101, 102, 99, 94);

        for (int i = 0; i < priceList.size(); i++){
            if (i == 3) AAPL.sell(buyer2);
            AAPL.alert(priceList.get(i));
        }
    }
}
