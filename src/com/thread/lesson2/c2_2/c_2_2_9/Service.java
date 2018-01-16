package com.thread.lesson2.c2_2.c_2_2_9;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:04.
 */

public class Service {
    synchronized public static void printA(){
        try{
            System.out.println("线程名称为："+Thread.currentThread().getName()
            +"在"+System.currentTimeMillis()+"进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为："+Thread.currentThread().getName()
            +"在"+System.currentTimeMillis()+"离开printA");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    synchronized public static void printB(){
        System.out.println("线程名称为:"+Thread.currentThread().getName()
        +"在"+System.currentTimeMillis()+"进入printB");
        System.out.println("线程名称为:"+Thread.currentThread().getName()
                +"在"+System.currentTimeMillis()+"离开printB");
    }
}
