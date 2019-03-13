package com.ljs.singleton;

/**
 * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 简单懒汉式
 * 优点：等到用到时才创建对象，不会造成内存浪费。
 * 缺点：在单线程下可以，在多线程下不可以。
 */
public class Singleton2 {

    //1.将构造函数私有化，不可以通过new的方式来创建对象
    private Singleton2() {
    }

    //2.1先不创建对象，等到用到的时候再创建
    private static Singleton2 singleton2 = null;

    //2.2调用这个方法，证明是要被用到了
    public static Singleton2 getSingleton2() {
        //3.如果这个对象引用为null,我们就创建并返回出去
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
