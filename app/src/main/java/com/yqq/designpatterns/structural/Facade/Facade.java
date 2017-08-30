package com.yqq.designpatterns.structural.Facade;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
//有层次结构的子系统 和子系统之间通信
public class Facade {
    private SystemA mSystemA;
    private SystemB mSystemB;
    private SystemC mSystemC;

    public Facade(){
        mSystemA=new SystemA();
        mSystemB=new SystemB();
        mSystemC=new SystemC();
    }


    public void  prepare(String str){
        mSystemA.prepare("初始化"+str);



    }

    public void  execute(String str){
        mSystemB.doWork("开始处理"+str);



    }



    public void  onDestroy(String str){
        mSystemC.finish(str+"释放");



    }
}
