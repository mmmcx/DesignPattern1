package com.study.designpattern.adapter.objectadapter;


/**
 * @author cx
 * @date 2022/7/15 001514:49
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====对象适配器======");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}
