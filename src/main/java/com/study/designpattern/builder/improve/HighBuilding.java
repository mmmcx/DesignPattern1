package com.study.designpattern.builder.improve;

/**
 * @author cx
 * @date 2022/7/13 001316:35
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼地基100米");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙900米");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
