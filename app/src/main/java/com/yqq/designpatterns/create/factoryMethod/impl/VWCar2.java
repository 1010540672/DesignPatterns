package com.yqq.designpatterns.create.factoryMethod.impl;

import android.util.Log;

import com.yqq.designpatterns.create.factoryMethod.Car2;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//具体的产品
public class VWCar2 extends Car2 {
    private static  final String  TAG="VWCar";
    @Override
    public void product() {
        Log.e(TAG,"生产大众汽车");
    }
}
