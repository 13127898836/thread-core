package com.thread.lesson2.c2_2.c_2_2_8_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 18:21.
 */

public class Service {
    public void testMethod1(MyObject object){
        synchronized (object){
            try{
                System.out.println("testMethod1____getLock time="
                +System.currentTimeMillis()
                +" run ThreadName="+Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1____releaseLock time="
                +System.currentTimeMillis()
                +" run ThreadName="+Thread.currentThread().getName());
            }catch (Exception e){

            }
        }
    }
}
