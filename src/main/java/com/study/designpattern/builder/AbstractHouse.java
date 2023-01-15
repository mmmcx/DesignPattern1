package com.study.designpattern.builder;

/**
 *
 * @author cx
 * @date 2022/7/13 001315:31
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void buildRoofed();

    public void build(){
        buildBasic();
        buildWalls();
        buildRoofed();
    }

}
