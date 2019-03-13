package com.ljs.factory.factory2;

/**
 * 简单/静态工厂
 */
public class factory2 {

    public static void main(String[] args) {
        // 拿到狗
        Animal A = AnimalFactory.createAnimal("dog");
        A.eat();

        // 拿到猫
        Animal C = AnimalFactory.createAnimal("cat");
        C.eat();
    }
}
