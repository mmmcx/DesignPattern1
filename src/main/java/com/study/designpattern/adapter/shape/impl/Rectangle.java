package com.study.designpattern.adapter.shape.impl;

import com.study.designpattern.adapter.shape.Shape;

/**
 * @author cx
 * @date 2022/9/13 001314:29
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Rectangle");
    }

    @Override
    public String description() {
        return "Rectangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
