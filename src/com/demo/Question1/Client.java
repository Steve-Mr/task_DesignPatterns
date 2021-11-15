package com.demo.Question1;

import com.demo.Question1.factories.SceneFactory;
import com.demo.Question1.factories.concrete.EasySceneFactory;
import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;

public class Client {

    public static void main(String[] args) {

        SceneFactory sceneFactory;
        Map map;
        Music music;
        Weather weather;

        sceneFactory = new EasySceneFactory();
        map = sceneFactory.createMap();
        music = sceneFactory.createMusic();
        weather = sceneFactory.createWeather();

        map.display();
        music.play();
        weather.display();

    }

}
