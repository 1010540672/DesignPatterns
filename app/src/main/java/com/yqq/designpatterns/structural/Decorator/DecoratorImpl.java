package com.yqq.designpatterns.structural.Decorator;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//不继承实现功能扩展
public class DecoratorImpl extends Decorator {
    private static final String TAG ="DecoratorImpl" ;
    public DecoratorImpl(OriginClass _OriginClass) {
        super(_OriginClass);

    }
    @Override
    public void baseFunc(String str) {
        super.baseFunc(str);
        extendFunc(str);
    }

    public void extendFunc(String str) {
        Log.e(TAG,"扩展功能"+str);

    }



}
