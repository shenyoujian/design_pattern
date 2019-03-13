package com.ljs.design.principle.openclose;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/12 23:10
 **/
public class Test {
    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96, "java从0开发企业级电商", 348.0);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        System.out.println("课程ID " + javaCourse.getId() + "课程名称 " + javaCourse.getName() + "课程价格 " + javaCourse.getOriginPrice() + "元 " +
                "打折后的价格 " + javaCourse.getPrice());
    }
}
