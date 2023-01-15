package com.study.designpattern.adapter.shape.adapter.classadapter;

import com.study.designpattern.adapter.shape.Shape;
import com.study.designpattern.adapter.shape.third.impl.Triangle;

/**
 * 类适配器
 * @author cx
 * @date 2022/9/13 001314:44
 */
public class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter() {
        super();
    }
    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Triangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}
