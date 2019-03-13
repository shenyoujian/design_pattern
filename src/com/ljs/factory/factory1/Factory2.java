package com.ljs.factory.factory1;

import java.io.FileNotFoundException;
import java.io.Reader;

/**
 * 工厂方法模式
 */
public class Factory2 {

    public static void main(String[] args) throws FileNotFoundException {

        //我有工厂了不用自己搞了
        // BufferedReader reader = new BufferedReader(new FileReader(new File("aa.txt")));
        Reader reader = ReaderFactory.getReader();

        //现在我想要一只狗，跟宠物店老板说，宠物店就去找狗回来了
        AnimalFactory f = new DogFactory();

        //店主就拿到一只狗给我
        Animal dog = f.createAnimal();
        dog.eat();


        //去找猫工厂拿一只猫
        AnimalFactory ff = new CatFactory();

        //店主就拿一只猫给我
        Animal cat = ff.createAnimal();
        cat.eat();

    }
}
