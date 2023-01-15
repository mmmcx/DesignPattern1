package com.study.designpattern.bridge;

/**
 * 折叠式手机类，继承抽象类Phone
 * @author cx
 * @date 2022/7/19 001914:59
 */
public class FoldedPhone extends PhoneAbstract {


    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠式手机");
    }

    @Override
    protected void close() {
        System.out.println("折叠式手机");
        super.close();
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠式手机");
    }
}
