package com.course.testng.parmeter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * 通过DataProvider：Object[][] 将值直接传递的到方法  参数化传值
 */
public class DataProviderTest {
    @Test(dataProvider = "test")
    public void dataProvider(String name,int age ,int result ){
        System.out.println("姓名"+name+", 年龄"+age+", 成绩"+result);
    }
   // @DataProvider(name="test")
    @DataProvider(name="test")
    public Object [] [] Prodater(){
        Object [] [] objects = new Object[][]{
                {"Jack",25 ,98},
                {"Lucy",27,99}
        };
        return  objects;
    }

}
