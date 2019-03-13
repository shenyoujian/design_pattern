package com.ljs.design.principle.openclose;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/12 23:44
 **/
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        //if()
        return super.getPrice() * 0.8;
    }


    public Double getOriginPrice(){
        return super.getPrice();
    }
}
