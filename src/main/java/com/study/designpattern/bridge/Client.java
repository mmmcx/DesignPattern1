package com.study.designpattern.bridge;

/**
 * @author cx
 * @date 2022/7/19 001915:06
 */
public class Client {

    public static void main(String[] args) {
        //获取折叠式手机(样式+品牌)
        PhoneAbstract phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("=============");
        PhoneAbstract phone1 = new FoldedPhone(new IPhone());
        phone1.open();
        phone1.call();
        phone1.close();

    }
}
