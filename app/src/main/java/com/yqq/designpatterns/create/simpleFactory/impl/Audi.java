package com.yqq.designpatterns.create.simpleFactory.impl;

import android.util.Log;

import com.yqq.designpatterns.create.simpleFactory.Car;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class Audi extends Car {
    private static  final String  TAG="Audi";
    @Override
    public void product() {
        Log.e(TAG,"生产奥迪汽车");
    }
}
