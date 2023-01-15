package com.study.designpattern.adapter.shape.adapter.classadapter;

import com.study.designpattern.adapter.shape.Shape;
import com.study.designpattern.adapter.shape.third.impl.Rhombus;

/**
 * 类适配器
 * @author cx
 * @date 2022/9/13 001314:48
 */
public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter() {
        super();
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }

    @Override
    public boolean isHide() {
        return false;
    }



}
