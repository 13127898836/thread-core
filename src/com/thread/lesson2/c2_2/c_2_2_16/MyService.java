package com.thread.lesson2.c2_2.c_2_2_16;

/**
 *
 * Created by 459105408@qq.com
 * 2018-01-22 0:10.
 */

public class MyService {
    private String lock = "123";
    public void testMethod(){
        try{
            synchronized (lock){
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
