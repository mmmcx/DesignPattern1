package com.study.designpattern.bridge;

/**
 * @author cx
 * @date 2022/7/19 001915:10
 */
public class UpRightPhone extends PhoneAbstract {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("智能手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("智能手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("智能手机");
    }
}
