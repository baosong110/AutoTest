package com.course.testng;

import org.testng.annotations.*;
import sun.awt.geom.AreaOp;

import java.awt.*;

public class BasicAnnotation {
    //最基本的注解  用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例一 testng");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试方法二 testng");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在“类”运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在“类”运行之后运行的方法");
    }
    @BeforeSuite
    public  void  beforBuite(){
        System.out.println("BeforSuite这是测试方法套类");
    }
    @AfterSuite
    public void afterBuite(){
        System.out.println("AfterBuite这是测试套件");
    }
}
