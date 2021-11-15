package com.demo.Question1.factories.concrete;

import com.demo.Question1.factories.SceneFactory;
import com.demo.Question1.products.concrete.maps.hardMap;
import com.demo.Question1.products.concrete.musics.hardMusic;
import com.demo.Question1.products.concrete.weather.hardWeather;
import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;

public class HardSceneFactory implements SceneFactory {
    @Override
    public Map createMap() {
        return new hardMap();
    }

    @Override
    public Music createMusic() {
        return new hardMusic();
    }

    @Override
    public Weather createWeather() {
        return new hardWeather();
    }
}
