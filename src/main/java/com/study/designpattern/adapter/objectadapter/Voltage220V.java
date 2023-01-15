package com.study.designpattern.adapter.objectadapter;

/**
 * @author cx
 * @date 2022/7/15 001511:13
 */
public class Voltage220V {

    public int output220V(){
        //输出220V电压
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
