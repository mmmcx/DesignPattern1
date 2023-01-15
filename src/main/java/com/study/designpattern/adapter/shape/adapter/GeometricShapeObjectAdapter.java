package com.study.designpattern.adapter.shape.adapter;

import com.study.designpattern.adapter.shape.Shape;
import com.study.designpattern.adapter.shape.third.GeometricShape;
import com.study.designpattern.adapter.shape.third.impl.Rhombus;
import com.study.designpattern.adapter.shape.third.impl.Triangle;

/**
 *
 * 对象适配器
 * @author cx
 * @date 2022/9/13 001314:35
 */
public class GeometricShapeObjectAdapter implements Shape {

    /**
     * 被适配对象
     */
    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + " can't be resized. Please create new one with required values.");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle object";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
        } else {
            return "Unknown object";
        }
    }

    @Override
    public boolean isHide() {
        return false;
    }

}
