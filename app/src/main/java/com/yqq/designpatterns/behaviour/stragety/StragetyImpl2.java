package com.yqq.designpatterns.behaviour.stragety;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class StragetyImpl2 implements IStragety {
    private static final String TAG ="StragetyImpl2" ;

    @Override
    public void algorithm(String str) {
        Log.e(TAG,str);
    }
}
