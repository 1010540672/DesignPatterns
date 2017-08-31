package com.yqq.designpatterns.behaviour.templatemethod;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class WorkerClass extends TemplateClass {
    private static final String TAG ="WorkerClass" ;

    @Override
    protected void getUp() {
        Log.e(TAG,"工人起床吃早餐");
    }

    @Override
    protected void doWork() {
        Log.e(TAG,"工人上班中......");
    }

    @Override
    protected void aferWork() {
        Log.e(TAG,"工人下班咯......");
    }
}
