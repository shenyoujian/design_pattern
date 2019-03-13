package com.ljs.design.principle.singleresponsibilty;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 18:35
 **/
public class Test {

    public static void main(String[] args) {
        /**1. 职责不明确,需要对每个不同的职责创建不同的类
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");
         */
        /**2. 类的单一职责, 对不同的职责创建不同的类*/
          FlyBird flyBird = new FlyBird();
          WalkBird walkBird = new WalkBird();
          flyBird.mainMoveMode("大雁");
          walkBird.mainMoveMode("鸵鸟");

        /**3. 对接口的单一职责
         对于课程接口,有两个职责,课程信息管理和学习退款课程管理
         一旦购买之后就可以获取课程的信息,但是一旦退款之后就不能获取课程信息
         也就是说这两个职责之间相互影响,所以拆分两个接口,让impl都实现这两个接口

         4. 对方法的单一职责
        参考Method

         5. 单一原则总结:
            在开发中,接口和方法最好遵循单一职责, 而类一多会造成爆炸,所以看情况而定.
         */




    }
}
