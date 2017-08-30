package com.yqq.designpatterns.create.builder;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//链式调用
public class ConcretBuilder2 extends Builder2 {
    private Car mCar=new Car();
    @Override
    public Builder2 buildEngine(String engine) {
        mCar.setmEngine(engine);
        return this;
    }

    @Override
    public Builder2 buildWheel(String wheel) {
        mCar.setmWheel(wheel);
        return this;
    }

    @Override
    public Builder2 buildCarBody(String carBody) {
        mCar.setmCarBody(carBody);
        return this;
    }

    @Override
    public Car create() {
        return mCar;
    }
}
