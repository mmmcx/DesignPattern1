package com.study.designpattern.prototype;

/**
 * @author cx
 * @date 2022/7/13 001311:15
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型...");
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep clone = (Sheep) sheep.clone();
    }

}
