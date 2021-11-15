package com.demo.Question1.products.concrete.weather;

import com.demo.Question1.products.interfaces.Weather;

public class easyWeather implements Weather {
    @Override
    public void display() {
        System.out.println("Easy Weather");
    }
}
