package com.study.designpattern.Singleton;

/**
 * @author cx
 * @date 2022/7/4 000413:57
 *
 * 单例设计
 */
public class SingletonTest01 {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2); //true

    }

}

//饿汉式(静态变量)
class Singleton{

    private Singleton(){}

    private final static  Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

}
//饿汉式(静态代码块)
class Singleton2{

    private Singleton2(){}

    private static Singleton2 instance ;
    static {
        instance = new Singleton2();
    }
    public static Singleton2 getInstance(){
        return instance;
    }

}
//单例 懒汉式(线程不安全)
class Singleton3{
    private static Singleton3 instance;

    private Singleton3(){}

    //提供一个静态公有方法，当使用该方法时，才去创建
    public static Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
//懒汉式(解决线程安全,同步方法，效率低)
class Singleton4{
    private static Singleton4 instance;

    private Singleton4(){}

    //提供一个静态公有方法，当使用该方法时，才去创建
    public static synchronized Singleton4 getInstance(){
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

}

//懒汉式(同步代码块 不能解决线程安全，用双重检查)
class Singleton5{
    private static volatile Singleton5 instance;

    private Singleton5(){}

    //提供一个静态公有方法，当使用该方法时，才去创建
    public static  Singleton5 getInstance(){
        if (instance == null) {

            synchronized (Singleton5.class){
                if(instance == null){

                    instance = new Singleton5();
                }
            }

        }
        return instance;
    }

}

//单例 静态内部类(推荐使用)
class Singleton6{

    private Singleton6(){}

    private static class SingletonInstance{
        private static final Singleton6 instance = new Singleton6();
    }

    public static synchronized Singleton6 getInstance(){
        return SingletonInstance.instance;
    }


}
//单例，枚举
class Singleton7{

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.sayOk();
    }

}
//枚举，推荐
enum SingletonEnum{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}
