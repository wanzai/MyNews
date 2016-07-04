package com.feyond.mynews.app;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/7/1.
 */
public class App extends Application{
    private static App mContext;

    @Override
    public void onCreate(){
        super.onCreate();
        mContext=this;
        Fresco.initialize(this);
    }
    public static App getContext(){
        return mContext;
    }
}
