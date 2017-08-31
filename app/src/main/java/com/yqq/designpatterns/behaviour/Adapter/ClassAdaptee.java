package com.yqq.designpatterns.behaviour.Adapter;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */
//类适配器
public class ClassAdaptee {

    private static final String TAG ="ClassAdaptee" ;

    public void dowork(String str){
        Log.e(TAG,str);
    }


}
