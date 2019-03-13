package com.ljs.singleton;

/**
 * * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 双重检测机制(DCL)懒汉式
 * 优点：相对4只会创建出一个对象
 * 缺点：还是不稳，会有重排序的问题
 */

public class Singleton5 {
    private Singleton5() {
    }

    private static Singleton5 singleton5 = null;

    public static Singleton5 getSingleton5() {
        if (singleton5 == null) {
            //将锁的范围缩小，提高性能
            synchronized (Singleton5.class) {
                if (singleton5 == null) {
                    singleton5 = Singleton5.getSingleton5();
                }
            }
        }
        return singleton5;
    }
}
