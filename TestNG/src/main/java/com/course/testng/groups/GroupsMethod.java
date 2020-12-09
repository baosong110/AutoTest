package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsMethod {
    @Test(groups ="server",priority = 0)
    public void testOne(){
        System.out.println("这是服务器测试方法1111111");
    }

    @Test(groups ="server",priority = 1)
    public void testTwo(){
        System.out.println("这是服务器测试方法222222");
    }

    @Test(groups ="client",priority = 2)
    public void testThree(){
        System.out.println("这是客户端测试方法333333");
    }

    @Test(groups ="client",priority = 3)
   public void testFour(){
       System.out.println("这是客户端测试方法444444");
  }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端运行之前运行的方法");
    }
    @AfterGroups("server")
    public  void  afterGroupsOnServer(){
        System.out.println("这是服务端运行之后的运行的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端端运行之前运行的方法");
    }
    @AfterGroups("client")
    public  void  afterGroupsOnClient(){
        System.out.println("这是客户端端运行之后的运行的方法");
    }
}
