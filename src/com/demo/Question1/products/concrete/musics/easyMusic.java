package com.demo.Question1.products.concrete.musics;

import com.demo.Question1.products.interfaces.Music;

public class easyMusic implements Music {
    @Override
    public void play() {
        System.out.println("Playing easy music");
    }
}
