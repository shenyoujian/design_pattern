package com.ljs.design.principle.dependenceinvsersion;

import com.ljs.design.principle.demete.Course;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 15:01
 **/
public class Ljs {

      //0
//    //我想学java课程
//    public void studyJavaCourse(){
//        System.out.println("ljs学习java课程...");
//    }
//
//    //我想学前端课程
//    public void studyFeCourse(){
//        System.out.println("ljs学习前端课程...");
//    }


     //1
//     public void studyCourse(ICourse course){
//         course.studyCourse();
//     }

     //2
//    private ICourse course;
//
//    public Ljs(ICourse course){
//        this.course = course;
//    }
//
//    public void studyCourse(){
//        course.studyCourse();
//    }

    //3
    private ICourse course;

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void studyCourse() {
        course.studyCourse();
    }
}
