package com.study.designpattern.factory;

/**
 * 计算机抽象类
 * @author cx
 * @date 2022/9/13 001310:35
 */
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
