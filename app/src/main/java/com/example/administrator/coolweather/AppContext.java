package com.example.administrator.coolweather;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/3/13.
 */
public class AppContext extends Application {

    private static Context instance;

    @Override
    public void onCreate()
    {
        instance = getApplicationContext();
    }

    public static Context getContext()
    {
        return instance;
    }

}