package com.yqq.designpatterns.create.builder;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//产品类
public class Car {


    public String getmEngine() {
        return mEngine;
    }

    public void setmEngine(String mEngine) {
        this.mEngine = mEngine;
    }

    public String getmWheel() {
        return mWheel;
    }

    public void setmWheel(String mWheel) {
        this.mWheel = mWheel;
    }

    public String getmCarBody() {
        return mCarBody;
    }

    public void setmCarBody(String mCarBody) {
        this.mCarBody = mCarBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mEngine='" + mEngine + '\'' +
                ", mWheel='" + mWheel + '\'' +
                ", mCarBody='" + mCarBody + '\'' +
                '}';
    }

    private String mEngine;
    private String mWheel;
    private String mCarBody;



}
