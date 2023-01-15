package com.study.designpattern.bridge.road;

/**
 * @author cx
 * @date 2022/9/22 00229:45
 */
public abstract class RoadAbstract {

    protected Vehicle vehicle;

    public RoadAbstract(Vehicle vehicle){
        this.vehicle = vehicle;
    }


    public abstract void driveOnRoad();


}
