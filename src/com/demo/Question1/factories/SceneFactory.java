package com.demo.Question1.factories;

import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;

public interface SceneFactory {
    public Map createMap();
    public Music createMusic();
    public Weather createWeather();
}
