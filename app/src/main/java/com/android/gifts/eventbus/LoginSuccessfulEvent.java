package com.android.gifts.eventbus;

/**
 * Created by munchado on 13/9/16.
 */
public class LoginSuccessfulEvent {
    public final String lastLoggedInTime;
    public final String username;
    public LoginSuccessfulEvent(String logintime,String username)
    {
        this.lastLoggedInTime=logintime;
        this.username=username;
    }
}
