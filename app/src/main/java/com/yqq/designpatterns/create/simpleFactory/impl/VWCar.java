package com.yqq.designpatterns.create.simpleFactory.impl;

import android.util.Log;

import com.yqq.designpatterns.create.simpleFactory.Car;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//具体的产品
public class VWCar extends Car {
    private static  final String  TAG="VWCar";
    @Override
    public void product() {
        Log.e(TAG,"生产大众汽车");
    }
}
