package com.study.designpattern.builder;

/**
 * @author cx
 * @date 2022/7/13 001315:41
 */
public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void buildRoofed() {
        System.out.println("普通房子封顶");
    }
}
