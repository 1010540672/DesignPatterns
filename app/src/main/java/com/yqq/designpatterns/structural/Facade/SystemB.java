package com.yqq.designpatterns.structural.Facade;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class SystemB {

    private static final String TAG = "SystemB";

    public void doWork(String str){

        Log.e(TAG,str);
    }

}
