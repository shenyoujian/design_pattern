package com.ljs.design.principle.demete;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 14:05
 **/
public class Boss {

    /**给teamleader下指令查查有多少课程*/
    public void commandCheckNumber(TeamLeader teamLeader){
        //boss完全不需要关注course,course对boss来说是陌生人
//        List<Course> courses = new ArrayList<Course>();
//        for(int i=0; i<20; i++){
//            courses.add(new Course());
//        }
        teamLeader.checkNumberOfCourse();
    }


}
