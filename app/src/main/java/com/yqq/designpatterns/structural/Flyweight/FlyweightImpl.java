package com.yqq.designpatterns.structural.Flyweight;

import android.util.Log;



/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class FlyweightImpl extends Flyweight {
    private static final String TAG ="FlyweightImpl" ;
    private String key;

    public FlyweightImpl(String key){
        this.key=key;

    }
    @Override
    public void showInfo(String key) {
        Log.e(TAG,key);
    }
}
