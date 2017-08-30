package com.yqq.designpatterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/30 0030.
 */

public class FlyweightFactory  {
    private static Map<String,Flyweight> infos=new HashMap<String,Flyweight>();
    public static  Flyweight getFlyweight(String key){
        if(infos.containsKey(key)){
            return infos.get(key);
        }else{
            Flyweight _Flyweight=new FlyweightImpl(key);
            infos.put(key,_Flyweight);
            return _Flyweight;
        }
    }


}
