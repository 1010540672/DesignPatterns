package com.yqq.designpatterns.behaviour.Adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
//对象适配器
public class ObjectAdapter implements ClassTarget {

    private static final String TAG ="ObjectAdapter" ;
    private ClassAdaptee mClassAdaptee;
    public ObjectAdapter(ClassAdaptee _ClassAdaptee){
        mClassAdaptee=_ClassAdaptee;
    }

    @Override
    public void dowork(String str) {
        mClassAdaptee.dowork(str);
    }

    @Override
    public void dowork2(String str) {
        Log.e(TAG,"=======对象适配器模式====");
    }
}
