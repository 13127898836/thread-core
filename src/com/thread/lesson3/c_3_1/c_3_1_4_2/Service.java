package com.thread.lesson3.c_3_1.c_3_1_4_2;

/**
 * Created by cch
 * 2018-04-10 11:37.
 */

public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait"+System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait"+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin notify() ThreadName="+Thread.currentThread().getName()+" time"+ System.currentTimeMillis());
                lock.notify();
                Thread.sleep(5000);
                System.out.println("end notify() ThreadName="+Thread.currentThread().getName()+" time"+ System.currentTimeMillis());

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
