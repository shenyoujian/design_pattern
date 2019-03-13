package com.ljs.design.principle.singleresponsibilty;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/13 18:51
 **/
public class Method {

    //第一种:这个方法既更新名字,又更新地址
    void updateInfo(String username, String address){
        username = "ljs";
        address = "广东";
    }

    //第二种:变长参数,注意可变长参数肯定是放在方法的最后,这个方法的职责就更多了
    void updateInfo(String username, String...properties){

    }

    //第三种: 每个方法一个职责
    void updateUsername(String username){
    }

    void updateAddress(String address){

    }
}
