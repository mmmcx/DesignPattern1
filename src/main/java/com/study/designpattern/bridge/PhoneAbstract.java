package com.study.designpattern.bridge;

/**
 * @author cx
 * @date 2022/7/19 001914:55
 */
public abstract class PhoneAbstract {

    //组合品牌
    private Brand brand;

    //构造器
    public PhoneAbstract(Brand brand){
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }

}
