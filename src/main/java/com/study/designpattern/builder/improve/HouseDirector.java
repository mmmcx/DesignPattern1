package com.study.designpattern.builder.improve;

/**
 * 指挥者---这里去指定制作流程，返回具体流程
 *
 * @author cx
 * @date 2022/7/13 001316:37
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector() {
    }

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }

    //通过setter 传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交个指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }


}
