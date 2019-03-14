package com.ljs.design.principle.demete;

/**
 * @Author ljs
 * @Description TODO
 * @Date 2019/3/14 14:10
 **/
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
