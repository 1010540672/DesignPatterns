package com.yqq.designpatterns.create.builder;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class ConcretBuilder extends Builder {
    private Car mCar=new Car();
    @Override
    public void buildEngine(String engine) {
        mCar.setmEngine(engine);
    }

    @Override
    public void buildWheel(String wheel) {
        mCar.setmWheel(wheel);
    }

    @Override
    public void buildCarBody(String carBody) {
        mCar.setmCarBody(carBody);
    }

    @Override
    public Car create() {
        return mCar;
    }
}
