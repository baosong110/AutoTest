package com.course.testng.parmeter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * TestNG-参数化 通过XML文件
 */
public class Parameter {
    @Test
    @Parameters({"name","age"}) //注解声明参数
    public  void parmeter(String name ,int age ){
        System.out.println("名字是"+name +"; 年龄为"+age);

    }
}
