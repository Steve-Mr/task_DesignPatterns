package com.demo.Question1.products.concrete.musics;

import com.demo.Question1.products.interfaces.Music;

public class hardMusic implements Music {
    @Override
    public void play() {
        System.out.println("Playing hard music");
    }
}
