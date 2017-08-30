package com.yqq.designpatterns.structural.Decorator;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public abstract class Decorator extends OriginClass {
    private OriginClass mOriginClass;
    public Decorator(OriginClass _OriginClass){
        mOriginClass=_OriginClass;
    }

    @Override
    public void baseFunc(String str) {
        mOriginClass.baseFunc(str);
    }
}
