package com.yqq.designpatterns.behaviour.stragety;

/**
 * Created by Administrator on 2017/8/31 0031.
 *
 * 策略模式将相关的条件分支转移到策略类中 ，避免使用多重条件语句，但是上层模块需要知道有多少策略
 *
 */

public interface IStragety {

    public void algorithm(String str);
}
