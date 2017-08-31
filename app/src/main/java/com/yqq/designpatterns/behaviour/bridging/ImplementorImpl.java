package com.yqq.designpatterns.behaviour.bridging;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class ImplementorImpl implements IImplementor {
    private static final String TAG = "ImplementorImpl";

    @Override
    public void doWork(String str) {
        Log.e(TAG,"具体的实现者");
    }
}
