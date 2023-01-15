package com.study.designpattern.bridge.road;

import com.study.designpattern.bridge.road.impl.Bus;
import com.study.designpattern.bridge.road.impl.Car;
import com.study.designpattern.bridge.road.impl.CementRoad;

/**
 * @author cx
 * @date 2022/9/22 002213:35
 */
public class Client {

    public static void main(String[] args) {

        RoadAbstract cementRoad = new CementRoad(new Bus());
        cementRoad.driveOnRoad();

        cementRoad = new CementRoad(new Car());
        cementRoad.driveOnRoad();




    }

}
