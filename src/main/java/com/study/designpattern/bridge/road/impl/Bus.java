package com.study.designpattern.bridge.road.impl;

import com.study.designpattern.bridge.road.Vehicle;

/**
 * @author cx
 * @date 2022/9/22 00229:44
 */
public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("公交车行驶...");
    }
}
