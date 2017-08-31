package com.yqq.designpatterns.behaviour.templatemethod;

/**
 * Created by Administrator on 2017/8/31 0031.
 * 把不变的行为搬移到子类 子类实现算法某些细节
 * 子类太多
 */

public abstract class TemplateClass {
    //final 方法防止被复写
    public final void OneDay4Live(){
        getUp();
        doWork();
        aferWork();
    }

    protected  abstract  void getUp();
    protected  abstract  void doWork();
    protected  abstract  void aferWork();

}
