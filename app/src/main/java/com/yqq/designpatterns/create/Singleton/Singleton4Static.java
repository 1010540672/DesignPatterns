package com.yqq.designpatterns.create.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/30 0030.
 *
 */
//第一次加载不会初始化
public class Singleton4Static  implements Serializable{

    private Singleton4Static(){

    }


    private static class Holder{
        private static  final Singleton4Static sInstance=new Singleton4Static();
    }
    //第一次调用该方法才会初始化
    public static Singleton4Static getInstance(){

        return Holder.sInstance;
    }
    // 防止反序列化获取多个对象
    private Object readResolve() throws ObjectStreamException {
        return Holder.sInstance;
    }
}
