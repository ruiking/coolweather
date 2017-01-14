package com.ruiking.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ruiking on 2017/1/14.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}