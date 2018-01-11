package com.thread.lesson2.c2_2.c_2_2_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 11:50.
 */

public class ObjectService {
    public void serviceMethod(){
        try{
            synchronized (this){
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time=" + System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
