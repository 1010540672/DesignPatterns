package com.yqq.designpatterns.create.factoryMethod;

import com.yqq.designpatterns.create.simpleFactory.*;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public abstract class CarFactory {

    public abstract <T extends Car2> T  createCar(Class<T> clz);

}
