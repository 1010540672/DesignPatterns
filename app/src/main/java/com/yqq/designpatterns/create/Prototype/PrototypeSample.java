package com.yqq.designpatterns.create.Prototype;

import android.util.Log;

import java.util.ArrayList;



/**
 * Created by Administrator on 2017/8/30 0030.
 */
//原型模式实现数据复制(复制和new的开销)
public class PrototypeSample  implements Cloneable{
    private static  final  String TAG="PrototypeSample";

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private String mTitle;

    public void setmList(ArrayList<String> mList) {
        this.mList = mList;
    }

    private ArrayList<String> mList=new ArrayList<>();

    public PrototypeSample(String title,ArrayList<String> list){
        mTitle=title;
        mList=list;

    }

    @Override
    public PrototypeSample clone() throws CloneNotSupportedException {
        //clone不执行构造方法
        PrototypeSample _PrototypeSample= (PrototypeSample) super.clone();
        _PrototypeSample.mTitle=this.mTitle;
       // _PrototypeSample.mList=this.mList;//引用类型修改指向同一块内存地址等价于操作了原始对象的引用字段  需要深拷贝对引用字段互不干扰
       _PrototypeSample.mList= (ArrayList<String>) this.mList.clone();//深拷贝

        return _PrototypeSample;
    }


    public void show(){
        Log.e("TAG","mTitle=="+mTitle);
        for(String info:mList){
            Log.e("TAG","info=="+info);
        }
    }
}
