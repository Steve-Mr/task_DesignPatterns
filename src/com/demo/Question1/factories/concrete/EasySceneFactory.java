package com.demo.Question1.factories.concrete;

import com.demo.Question1.factories.SceneFactory;
import com.demo.Question1.products.concrete.maps.easyMap;
import com.demo.Question1.products.concrete.musics.easyMusic;
import com.demo.Question1.products.concrete.weather.easyWeather;
import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;

public class EasySceneFactory implements SceneFactory {
    @Override
    public Map createMap() {
        return new easyMap();
    }

    @Override
    public Music createMusic() {
        return new easyMusic();
    }

    @Override
    public Weather createWeather() {
        return new easyWeather();
    }
}
