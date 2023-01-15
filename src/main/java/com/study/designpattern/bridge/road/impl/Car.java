package com.study.designpattern.bridge.road.impl;

import com.study.designpattern.bridge.road.Vehicle;

/**
 * @author cx
 * @date 2022/9/22 00229:43
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("驾驶小汽车...");
    }
}
