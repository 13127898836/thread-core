package com.thread.lesson3.c_3_1.c_3_1_4;

/**
 * Created by cch
 * 2018-04-10 11:24.
 */

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                lock.wait();
                //Thread.sleep(100);
                System.out.println("end wait()");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
