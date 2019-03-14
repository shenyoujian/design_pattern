package com.ljs.design.principle.demete;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 14:05
 **/
public class TeamLeader {

    List<Course> courses;

    public void checkNumberOfCourse(){
        courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("课程的数量:" + courses.size());
    }
}
