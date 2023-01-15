package com.study.designpattern.adapter.classadapter;

/**
 * 适配器类
 * @author cx
 * @date 2022/7/15 001514:30
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
