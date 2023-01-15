package com.study.designpattern.builder.improve;


/**
 * @author cx
 * @date 2022/7/13 001317:03
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println("------");
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();
    }
}
