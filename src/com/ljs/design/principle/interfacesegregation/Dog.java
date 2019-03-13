package com.ljs.design.principle.interfacesegregation;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 20:09
 **/
public class Dog implements IEatAction, ISwimAction {

    /**狗不会飞,所以需要把接口隔离开来*/




    @Override
    public void eat() {

    }

//    @Override
//    public void fly() {
//
//    }

    @Override
    public void swim() {

    }


}
