package com.ljs.design.principle.singleresponsibilty;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 18:42
 **/
public interface ICourse {

    //职责一:课程信息的管理
    String getCourseName();
    byte[] getCourseVideo();

    //职责二:学习和退款的管理
    void StudyCourse();
    void refundCourse();
}
