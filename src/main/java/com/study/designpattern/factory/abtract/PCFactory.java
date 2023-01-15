package com.study.designpattern.factory.abtract;

import com.study.designpattern.factory.Computer;
import com.study.designpattern.factory.PC;

/**
 * @author cx
 * @date 2022/9/13 001311:06
 */
public class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
