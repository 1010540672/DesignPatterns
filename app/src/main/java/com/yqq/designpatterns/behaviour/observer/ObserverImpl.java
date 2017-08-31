package com.yqq.designpatterns.behaviour.observer;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class ObserverImpl implements IObserver {

    private String mName;
    private static final String TAG ="ObserverImpl" ;
    public ObserverImpl(String name){
        mName=name;
    }

    @Override
    public void notify(String msg) {
        Log.e(TAG,mName+"收到了"+msg);
    }
}
