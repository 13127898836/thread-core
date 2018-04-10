package com.thread.lesson3.c_3_1.c_3_1_3;

/**
 * Created by cch
 * 2018-04-10 10:58.
 */

public class MyThread1 extends Thread{
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
           synchronized (lock){
               System.out.println("start wait time="+System.currentTimeMillis());
               lock.wait();
               System.out.println("end wait time="+System.currentTimeMillis());

           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
