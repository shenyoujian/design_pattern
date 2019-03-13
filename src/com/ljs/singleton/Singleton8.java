package com.ljs.singleton;

/**
 * 枚举类方式实现
 * 好处：
 * 1、简单，直接写就行
 * 2、防止多次实例化，即使是在面对复杂的序列化或者反射攻击时候(安全)
 */
public enum Singleton8 {
    SINGLETON_8,
}
