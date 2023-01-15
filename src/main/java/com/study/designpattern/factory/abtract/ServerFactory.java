package com.study.designpattern.factory.abtract;

import com.study.designpattern.factory.Computer;
import com.study.designpattern.factory.Server;

/**
 * @author cx
 * @date 2022/9/13 001311:07
 */
public class ServerFactory implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}
