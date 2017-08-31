package com.yqq.designpatterns.behaviour.observer;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public abstract class Subject {
    public abstract  void addObserver(IObserver observer);
    public abstract  void removeObserver(IObserver observer);

    public abstract  void notify(String msg);
}
