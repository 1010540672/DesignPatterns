package com.yqq.designpatterns.create.builder;



/**
 * Created by Administrator on 2017/8/30 0030.
 */
//建造者规范
public abstract class Builder {
    public abstract  void buildEngine(String engine);
    public abstract  void buildWheel(String wheel);
    public abstract  void buildCarBody(String carBody);
    public abstract Car create();

}
