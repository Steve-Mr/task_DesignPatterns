package com.demo.Question1.products.concrete.maps;

import com.demo.Question1.products.interfaces.Map;

public class hardMap implements Map {

    @Override
    public void display() {
        System.out.println("This is hard map");
    }
}
