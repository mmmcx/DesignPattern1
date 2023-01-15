package com.study.designpattern.bridge.road.impl;

import com.study.designpattern.bridge.road.RoadAbstract;
import com.study.designpattern.bridge.road.Vehicle;

/**
 * @author cx
 * @date 2022/9/22 00229:48
 */
public class UnpavedRoad extends RoadAbstract {

    public UnpavedRoad(Vehicle vehicle){
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println("柏油路");
    }
}
