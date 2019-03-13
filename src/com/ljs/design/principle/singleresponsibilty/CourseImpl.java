package com.ljs.design.principle.singleresponsibilty;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 18:49
 **/
public class CourseImpl implements ICourseContent, ICourseManage {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void StudyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
