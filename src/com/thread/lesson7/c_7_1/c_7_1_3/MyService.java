package com.thread.lesson7.c_7_1.c_7_1_3;

/**
 * Created by cch
 * 2018-04-24 12:35.
 */

public class MyService {
    synchronized public static  void serviceMethod(){
        System.out.println(Thread.currentThread().getName()+" 进入业务方法");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
