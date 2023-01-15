package com.study.designpattern.factory;

import com.study.designpattern.factory.abtract.ComputerAbstractFactory;

/**
 *
 * 计算机工厂类
 * @author cx
 * @date 2022/9/13 001310:38
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }

    /**
     * 通过抽象工厂方法获取,替换之前的if-else
     * @param abstractFactory
     * @return
     */
    public static Computer getComputer(ComputerAbstractFactory abstractFactory){

        return abstractFactory.createComputer();
    }

}
