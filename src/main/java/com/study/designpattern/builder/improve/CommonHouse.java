package com.study.designpattern.builder.improve;

/**
 * @author cx
 * @date 2022/7/13 001316:32
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10米");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
