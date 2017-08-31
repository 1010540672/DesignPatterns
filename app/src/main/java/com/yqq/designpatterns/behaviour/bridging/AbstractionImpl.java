package com.yqq.designpatterns.behaviour.bridging;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class AbstractionImpl extends  Abstraction{

    public AbstractionImpl(IImplementor _IImplementor) {
        super(_IImplementor);
    }

    @Override
    public void doWork(String str) {
        mImplementor.doWork(str);
    }



}
