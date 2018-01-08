package com.thread.lesson2.c2_1.c2_1_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:48.
 */

public class Service {
    synchronized public void testMethod(){
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("Thread name ="+Thread.currentThread().getName()+
            " run begin time="+System.currentTimeMillis());
            int i =1;
            while(i==1){
                if((""+Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("Thread name ="+Thread.currentThread().getName()+
                            " run exceptiobTime="+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else{
            System.out.println("Thread B run Time ="+System.currentTimeMillis());
        }
    }
}
