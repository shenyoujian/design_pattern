package com.ljs.factory.factory1;

// 继承宠物工厂
public class DogFactory implements AnimalFactory {
    @Override
    //创建狗
    public Animal createAnimal() {
        return new Dog();
    }
}
