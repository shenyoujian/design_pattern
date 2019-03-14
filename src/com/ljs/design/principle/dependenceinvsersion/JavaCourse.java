package com.ljs.design.principle.dependenceinvsersion;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 15:09
 **/
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java...");
    }
}
