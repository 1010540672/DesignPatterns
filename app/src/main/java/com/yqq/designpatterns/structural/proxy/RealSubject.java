package com.yqq.designpatterns.structural.proxy;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class RealSubject implements Subject {
    private static final String TAG ="RealSubject";

    @Override
    public void doMyLoveThings(String desc) {
        Log.e(TAG,desc);
    }
}
