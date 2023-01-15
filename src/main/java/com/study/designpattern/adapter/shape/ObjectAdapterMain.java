package com.study.designpattern.adapter.shape;

import com.study.designpattern.adapter.shape.adapter.GeometricShapeObjectAdapter;
import com.study.designpattern.adapter.shape.impl.Drawing;
import com.study.designpattern.adapter.shape.impl.Rectangle;
import com.study.designpattern.adapter.shape.third.impl.Rhombus;
import com.study.designpattern.adapter.shape.third.impl.Triangle;

/**
 *
 * 两种方法具有相同的输出。但：
 *
 * 类适配器使用继承并且只能包装一个类。我不能包装接口，因为根据定义，它必须派生自某个基类。
 * 对象适配器使用组合并且可以包装类以及接口。它包含对类或接口对象实例的引用。对象适配器是比较简单的一种，可以应用在大部分场景中。
 * @author cx
 * @date 2022/9/13 001314:42
 */
public class ObjectAdapterMain {
    public static void main(String[] args) {

        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();

    }

}
