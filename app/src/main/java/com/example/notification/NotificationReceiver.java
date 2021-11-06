package com.example.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        String message = intent.getStringExtra("toast message");
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();

    }
}
