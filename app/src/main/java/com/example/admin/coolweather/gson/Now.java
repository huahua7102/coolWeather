package com.example.admin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2018/7/25.
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
