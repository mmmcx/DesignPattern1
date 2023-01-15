package com.study.designpattern.adapter.shape;

import com.study.designpattern.adapter.shape.impl.Drawing;
import com.study.designpattern.adapter.shape.impl.Rectangle;

/**
 * @author cx
 * @date 2022/9/13 001314:31
 */
public class TestShape {

    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();


    }

}
