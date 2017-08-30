package com.yqq.designpatterns.create.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/30 0030.
 * DCL
 */

public class Singleton implements Serializable{
    private volatile  static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(null==singleton){
            synchronized (Singleton.class){
                if (null==singleton){
                    singleton=new Singleton();
                }

            }
        }
        return singleton;
    }
    // 防止反序列化获取多个对象
    private Object readResolve() throws ObjectStreamException {
        return singleton;
    }

}
