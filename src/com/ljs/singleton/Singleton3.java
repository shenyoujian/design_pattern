package com.ljs.singleton;

/**
 * * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 加锁的懒汉式
 * 优点：加锁保证多线程环境下也没问题
 * 缺点：在方法上加锁在多线程环境下性能低下
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 singleton3 = null;

    public static synchronized Singleton3 getSingleton3() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
