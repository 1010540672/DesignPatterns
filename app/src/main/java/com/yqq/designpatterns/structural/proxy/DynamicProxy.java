package com.yqq.designpatterns.structural.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//动态代理
public class DynamicProxy implements InvocationHandler {
    private Object mObj;
    private static final String TAG ="DynamicProxy" ;
    public  DynamicProxy(Object obj){
        mObj=obj;//mObj为被代理的对象
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Log.e(TAG,"invoke");
      Object result=  method.invoke(mObj,objects);

        if(method.getName().equals("doMyLoveThings")){
            Log.e(TAG,"method.getName("+method.getName());

        }
        return result;
    }
}
