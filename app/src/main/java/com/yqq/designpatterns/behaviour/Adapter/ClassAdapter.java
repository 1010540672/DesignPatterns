package com.yqq.designpatterns.behaviour.Adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
//类适配器(与ClassAdaptee通信通过适配器进行)
public class ClassAdapter extends ClassAdaptee implements ClassTarget{


    private static final String TAG ="ClassAdapter" ;

    @Override
    public void dowork2(String str) {
        //源类没有的接口 通过适配器实现
        Log.e(TAG,"已经适配");
    }
}
