package com.yqq.designpatterns.behaviour.bridging;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public abstract class Abstraction {

    protected   IImplementor mImplementor;
    public  Abstraction(IImplementor _IImplementor){
        mImplementor=_IImplementor;
    }
    public abstract void doWork(String str);


}
