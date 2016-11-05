package com.android.gifts.eventbus;

import android.os.Handler;
import android.os.Looper;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by munchado on 13/9/16.
 */
public class TimerClass {
    EventBus bus=EventBus.getDefault();
    String string;
    public TimerClass(String str)
    {
        string=str;
    }
    public void callAfterSomeDelay()
    {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something here

                bus.post(new SuccessEvent("Welcome "+string+" :)"));
            }
        }, 2500);
    }
}
