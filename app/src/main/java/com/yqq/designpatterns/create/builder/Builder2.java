package com.yqq.designpatterns.create.builder;



/**
 * Created by Administrator on 2017/8/30 0030.
 */
//建造者规范
public abstract class Builder2 {
    public abstract  Builder2 buildEngine(String engine);
    public abstract  Builder2 buildWheel(String wheel);
    public abstract  Builder2 buildCarBody(String carBody);
    public abstract Car create();

}
