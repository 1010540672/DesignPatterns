package com.yqq.designpatterns.structural.Facade;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class SystemA {

    private static final String TAG = "SystemA";

    public void prepare(String str){

        Log.e(TAG,str);
    }

}
