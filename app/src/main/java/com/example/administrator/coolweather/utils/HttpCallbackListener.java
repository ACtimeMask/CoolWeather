package com.example.administrator.coolweather.utils;

/**
 * Created by Administrator on 2016/3/6.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}
