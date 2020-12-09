package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreOne(){
        System.out.println("ignoreOne 执行！");
    }
    @Test(enabled = false)
    public void ignoreTwo(){
        System.out.println("ignoreTwo 测试执行");
    }
    @Test(enabled = false)
    public  void  ignoreThree(){
        System.out.println("ignoreThree 测试执行3");
    }
}
p