package com.yqq.designpatterns.structural.proxy;



/**
 * Created by Administrator on 2017/8/30 0030.
 */
//解决模块耦合问题
    //静态代理
public class Proxy implements Subject {

    private Subject mSubject;
    public Proxy(Subject subject){
        this.mSubject=subject;
    }
    @Override
    public void doMyLoveThings(String desc) {
        mSubject.doMyLoveThings(desc);
    }
}
