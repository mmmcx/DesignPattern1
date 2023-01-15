package com.study.designpattern.adapter.objectadapter;

/**
 * @author cx
 * @date 2022/7/15 001514:43
 */
public class Phone {

    //充电
    public void charging(IVoltage5V iVoltage5V){

        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V,不能充电");
        }

    }

}
