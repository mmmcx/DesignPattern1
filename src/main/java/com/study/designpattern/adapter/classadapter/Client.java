package com.study.designpattern.adapter.classadapter;

/**
 * @author cx
 * @date 2022/7/15 001514:49
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====类适配器======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
