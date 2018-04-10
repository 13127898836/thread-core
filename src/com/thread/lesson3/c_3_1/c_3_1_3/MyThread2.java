package com.thread.lesson3.c_3_1.c_3_1_3;

/**
 * Created by cch
 * 2018-04-10 11:00.
 */

public class MyThread2 extends Thread{
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
            synchronized (lock){
                System.out.println("start notify time="+System.currentTimeMillis());
                lock.notify();
                System.out.println("end notify time="+System.currentTimeMillis());

            }
        }catch (Exception e){

        }
    }
}
