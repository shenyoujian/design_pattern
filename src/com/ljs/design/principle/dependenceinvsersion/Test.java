package com.ljs.design.principle.dependenceinvsersion;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 15:02
 **/
public class Test {

    public static void main(String[] args) {
        /**0. 当要扩展学习python课程的时候, 我们只能去ljs再实现一个learnpython的方法
         * 也就是当高级层次test想要实现什么,ljs相对低级层就得去实现什么,违背了依赖倒置原则
         * 高级模块不应该依赖底层模块
        */
//        Ljs ljs = new Ljs();
//        ljs.studyJavaCourse();
//        ljs.studyFeCourse();

        /**1. 面向接口编程
         *  这样实现全由test高级模块来控制,扩展也方便,ljs也只需要要一个studyCourse方法
         */
//        Ljs ljs = new Ljs();
//        ljs.studyCourse(new JavaCourse());
//        ljs.studyCourse(new FeCourse());

        /**2. 使用构造器注入
         *  缺点: 需要new 多个ljs
         */
//        Ljs ljs = new Ljs(new JavaCourse());
//        ljs.studyCourse();
//        Ljs ljs1 = new Ljs(new FeCourse());
//        ljs1.studyCourse();


        /**3. 使用setter注入
         *
         */
        Ljs ljs = new Ljs();
        ljs.setCourse(new JavaCourse());
        ljs.studyCourse();

    }

    /**总结: 面向接口和setter最好*/
}
