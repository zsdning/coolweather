package com.example.administrator.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.administrator.coolweather.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/3/13.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //再次启动AutoUpdateService
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startActivity(i);
    }
}
