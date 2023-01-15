package com.study.designpattern.adapter.interfaceadapter;

/**
 * @author cx
 * @date 2022/7/15 001517:32
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("====接口适配====");
        new AbsAdapter(){
            //只需要覆盖需要的接口方法
            @Override
            public void m1() {
                System.out.println("实现了m1的方法");
            }
        };

    }

}
