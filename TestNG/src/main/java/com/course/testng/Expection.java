package com.course.testng;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.Test;

public class Expection {
    /**
     * 什么时候用到异常测试
     * 在我们期望结果某个异常得时候
     * 比如：我们传入某卸不合法的参数，程序抛出异常
     *也就是我们预期结果就是这个异常
     */
     //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public  void  Failed(){

        System.out.println("这是异常失败得测试");
    }
    //这是一个测试结果成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void sucess(){
        System.out.println("这是我得异常测试");
        throw new RuntimeException();

    }
}
