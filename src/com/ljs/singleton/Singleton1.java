package com.ljs.singleton;

/**
 * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 饿汉式
 * 缺点：一上来就创建对象，如果该实例从始至终都没被使用过，则会造成内存浪费。
 */
public class Singleton1 {

    //1.将构造函数私有化，不可以通过new的方式来创建对象
    private Singleton1() {
    }

    //2.在类的内部创建自行实例
    private static Singleton1 singleton1 = new Singleton1();

    //3.提供获取唯一实例的方法
    public static Singleton1 getSingleton1() {
        return singleton1;
    }


}
