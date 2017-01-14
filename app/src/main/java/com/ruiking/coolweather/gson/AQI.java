package com.ruiking.coolweather.gson;

/**
 * Created by ruiking on 2017/1/14.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
