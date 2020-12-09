package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups="tea")
public class GroupClassThree {
    public void groupTeacher1(){
        System.out.println("groupClassThree运行teacher1方法");
    }
    public void groupTeacher2(){
        System.out.println("groupClassThree运行teacher2方法");
    }
}
