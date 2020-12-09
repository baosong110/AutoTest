package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsClassTwo {
    public void groupsStu2(){
        System.out.println("GropusClassTwo类运行的Stu2的方法。。。。。。");
    }
    public void groupsStu1(){
        System.out.println("GroupsClassTwo类运行的Stu1的方法。。。。。。");
    }
}
