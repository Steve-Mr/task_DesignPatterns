package com.demo.Question2;

import com.demo.Question2.observers.Buyer;
import com.demo.Question2.observers.Observer;
import com.demo.Question2.subjects.ConcreteStock;
import com.demo.Question2.subjects.Stock;

import java.util.Arrays;
import java.util.List;

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

        List<Integer> priceList =
                Arrays.asList(100, 105, 100, 101, 102, 99, 94);

        for (double price : priceList){
            AAPL.alert(price);
        }
    }
}
