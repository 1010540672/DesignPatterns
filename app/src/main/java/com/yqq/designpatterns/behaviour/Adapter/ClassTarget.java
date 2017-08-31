package com.yqq.designpatterns.behaviour.Adapter;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public interface ClassTarget {


    public void dowork(String str);
    //通过这个接口兼容
    public void dowork2(String str);


}
