package com.thread.lesson3.c_3_2.c_3_2_6;

/**
 * Created by cch
 * 2018-04-13 13:27.
 */

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                System.out.println(Thread.currentThread().getName()+" run timer="+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+" run end timer="+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
