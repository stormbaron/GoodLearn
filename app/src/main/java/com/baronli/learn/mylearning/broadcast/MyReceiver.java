package com.baronli.learn.mylearning.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (null != intent) {
            Log.e("MyReceiver", intent.getStringExtra("Test")+intent.getAction() + intent.getType() + intent.getData());
        } else {
            Log.e("MyReceiver", "intent =null");
        }
    }
}
