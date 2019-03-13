package com.ljs.singleton;

/**
 * * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 最终双重检测机制(DCL)懒汉式
 * 优点：不会有重排序问题
 * 缺点：
 */
public class Singleton6 {
    private Singleton6() {
    }

    //加上volatile
    private static volatile Singleton6 singleton6 = null;

    public static  Singleton6 getSingleton6() {
        if (singleton6 == null) {
            //将锁的范围缩小，提高性能
            synchronized (Singleton6.class) {
                if (singleton6 == null) {
                    singleton6 = Singleton6.getSingleton6();
                }
            }
        }
        return singleton6;
    }
}
