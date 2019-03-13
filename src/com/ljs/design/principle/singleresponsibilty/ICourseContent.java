package com.ljs.design.principle.singleresponsibilty;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 18:48
 **/
public interface ICourseContent {
    //职责一:课程信息的管理
    String getCourseName();
    byte[] getCourseVideo();
}
