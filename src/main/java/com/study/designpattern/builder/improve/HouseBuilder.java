package com.study.designpattern.builder.improve;

/**
 * 抽象的构建者--需要构建所需的流程
 * @author cx
 * @date 2022/7/13 001316:27
 */
public abstract class HouseBuilder {

    protected House house = new House();
    //将构建的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    //建造产品,将产品(房子)返回
    public House buildHouse(){
        return house;
    }





}
