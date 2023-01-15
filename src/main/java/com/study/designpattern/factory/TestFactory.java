package com.study.designpattern.factory;

import com.study.designpattern.factory.abtract.PCFactory;
import com.study.designpattern.factory.abtract.ServerFactory;

/**
 * 工厂类测试
 * @author cx
 * @date 2022/9/13 001310:39
 */
public class TestFactory {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);

        System.out.println("抽象工厂获取.........");

        Computer pc1 = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
        Computer server1 = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc1);
        System.out.println("AbstractFactory Server Config::"+server1);

    }

}
