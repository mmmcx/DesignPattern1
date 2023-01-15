package com.study.designpattern.bridge.road.impl;

import com.study.designpattern.bridge.road.RoadAbstract;
import com.study.designpattern.bridge.road.Vehicle;

/**
 * @author cx
 * @date 2022/9/22 002213:33
 */
public class CementRoad extends RoadAbstract {

    public CementRoad(Vehicle vehicle){
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("水泥路");
    }
}
