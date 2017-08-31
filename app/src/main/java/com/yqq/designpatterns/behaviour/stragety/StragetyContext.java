package com.yqq.designpatterns.behaviour.stragety;

/**
 * Created by Administrator on 2017/8/31 0031.
 */

public class StragetyContext {
    private IStragety mStragety;
    public StragetyContext(IStragety stragety){
        mStragety=stragety;

    }

    public void algorithm(String str){
        mStragety.algorithm(str);

    }


}
