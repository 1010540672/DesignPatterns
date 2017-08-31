package com.yqq.designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class SubscriptSubject extends Subject {

    private ArrayList<IObserver> mObserver=new ArrayList<IObserver>();
    @Override
    public void addObserver(IObserver observer) {
        mObserver.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        mObserver.remove(observer);
    }

    @Override
    public void notify(String msg) {
        for(IObserver observer:mObserver){
            observer.notify(msg);
        }

    }
}
