package com.thesoftparrot.storageapp.visapp;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class VisApp extends Application {
    private static VisApp instance;

    public synchronized static VisApp getInstance() {
        return instance;
    }

    public Context getAppContext(){
        return instance.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        MultiDex.install(this);
    }
}
