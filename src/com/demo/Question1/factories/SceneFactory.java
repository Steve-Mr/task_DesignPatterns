package com.demo.Question1.factories;

import com.demo.Question1.products.interfaces.Map;
import com.demo.Question1.products.interfaces.Music;
import com.demo.Question1.products.interfaces.Weather;

public interface SceneFactory {
    Map createMap();
    //地形图
    Music createMusic();
    //背景音乐
    Weather createWeather();
    //天气
}
