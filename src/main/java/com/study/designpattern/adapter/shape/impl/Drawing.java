package com.study.designpattern.adapter.shape.impl;

import com.study.designpattern.adapter.shape.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cx
 * @date 2022/9/13 001314:30
 */
public class Drawing {

    List<Shape> shapes = new ArrayList<Shape>();

    public Drawing() {
        super();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return new ArrayList<Shape>(shapes);
    }

    public void draw() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to draw!");
        } else {
            shapes.stream().forEach(shape -> shape.draw());
        }
    }

    public void resize() {
        if (shapes.isEmpty()) {
            System.out.println("Nothing to resize!");
        } else {
            shapes.stream().forEach(shape -> shape.resize());
        }
    }

}
