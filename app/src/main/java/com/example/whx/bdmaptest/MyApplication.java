package com.example.whx.bdmaptest;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by whx on 2016/9/12.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        SDKInitializer.initialize(this);
    }
}
