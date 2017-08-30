package com.yqq.designpatterns.structural.Decorator;

import android.util.Log;



/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class OriginClassImpl extends OriginClass {

    private static final String TAG ="OriginClassImpl" ;

    @Override
    public void baseFunc(String str) {
        Log.e(TAG,str);
    }
}
