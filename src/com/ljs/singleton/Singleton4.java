package com.ljs.singleton;

/**
 * * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 双重检测机制(DCL)懒汉式
 * 优点：将锁的范围缩小，性能提高
 * 缺点：还是可能创建两个对象
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static Singleton4 singleton4 = null;

    public static Singleton4 getSingleton4() {
        if (singleton4 == null) {
            //将锁的范围缩小，提高性能
            synchronized (Singleton4.class) {
                singleton4 = new Singleton4();
            }
        }
        return singleton4;
    }

}
