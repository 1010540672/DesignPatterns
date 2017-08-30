package com.yqq.designpatterns.create.simpleFactory;

import com.yqq.designpatterns.create.simpleFactory.impl.Audi;
import com.yqq.designpatterns.create.simpleFactory.impl.VWCar;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//不足：增加新的产品需要修改工厂方法，不符合开闭原则
public class SimpleFactory {


    public static  Car createCar(String production){
        Car _car=null;
        switch (production){
            case  "vw":
                _car=new VWCar();
                break;
            case "audi":
                _car=new Audi();
                break;
        }

        return _car;
    }

}
