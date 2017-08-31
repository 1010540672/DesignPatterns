package com.yqq.designpatterns.behaviour.templatemethod;

import android.util.Log;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class StudentClass extends TemplateClass {
    private static final String TAG ="StudentClass" ;

    @Override
    protected void getUp() {
        Log.e(TAG,"学生起床准备自习");
    }

    @Override
    protected void doWork() {
        Log.e(TAG,"学生上课中.....");
    }

    @Override
    protected void aferWork() {
        Log.e(TAG,"学生放学咯.....");
    }
}
