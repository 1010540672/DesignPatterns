package com.yqq.designpatterns.create.factoryMethod;



/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class SHCarFactory extends CarFactory {
    @Override
    public <T extends Car2> T createCar(Class<T> clz) {
        Car2 mCar=null;
        String className=clz.getName();
        try {
            //通过反射来创建产品，避免修改工厂类
            mCar=(Car2) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return (T) mCar;
    }


}
