package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups ="stu")
public class GroupsClassOne {
    public void groupsStu1(){
        System.out.println("GroupsClassOne运行的Students1方法");
    }
    public void groupsStu2(){
        System.out.println("GroupsClassOne运行的Student2方法");
    }
}
