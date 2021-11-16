package com.demo.Question1;

import com.demo.Question1.factories.SceneFactory;
import com.demo.Question1.factories.concrete.EasySceneFactory;
import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;
import com.demo.Util.XMLUtil;

/**
 * 假设一个联机游戏中有多种游戏场景，
 * 需要为每一个游戏场景，
 * 创建不同的地形图、不同的背景音乐、不同的天气现象等实例对象。
 * 请设计一个程序，使用抽象工厂模式实现该程序的设计。
 * */
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

        sceneFactory = (SceneFactory) XMLUtil.getBean("src/com/demo/Question1/config.xml");
        if (sceneFactory != null) {
            map = sceneFactory.createMap();
            music = sceneFactory.createMusic();
            weather = sceneFactory.createWeather();
        }

        map.display();
        music.play();
        weather.display();
    }

}
