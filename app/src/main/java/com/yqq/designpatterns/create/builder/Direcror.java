package com.yqq.designpatterns.create.builder;

import com.yqq.designpatterns.create.simpleFactory.*;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//流程规范
public class Direcror {

    private  Builder mBuilder;
    public Direcror(Builder builder){
        mBuilder=builder;
    }

    public Car createCar(){
        mBuilder.buildEngine("最牛发动机");
        mBuilder.buildCarBody("最酷车身");
        mBuilder.buildWheel("最贵轮胎");
        return mBuilder.create();
    }

}
