package com.ljs.singleton;

/**
 * * 编写单例模式的步骤:
 * 1、将构造函数私有化
 * 2、在类的内部创建实例
 * 3、提供获取唯一实例的方法
 * 静态内部类懒汉式
 * 原理：当任何一个线程第一次调用getSingleton7()时，都会使
 *LazyHolder被加载和被初始化，此时静态初始化器将执行Singleton7的初始化操作
 * (被调用时才进行初始化)
 * 初始化静态数据时，java提供了线程安全性保证(所以不需要任何的同步)
 *
 */
public class Singleton7 {
    private Singleton7(){}

    //使用内部类的方式来实现懒加载
    private static class LazyHolder{
        //创建单例对象
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }

    //获取对象
    public static final Singleton7 getSingleton7(){
        return LazyHolder.SINGLETON_7;
    }
}
