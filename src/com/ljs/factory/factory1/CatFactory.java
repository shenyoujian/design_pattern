package com.ljs.factory.factory1;

public class CatFactory implements AnimalFactory {

    @Override
    //创建猫
    public Animal createAnimal() {
        return new Cat();
    }
}
