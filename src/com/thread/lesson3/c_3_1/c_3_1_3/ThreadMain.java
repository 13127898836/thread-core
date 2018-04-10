package com.thread.lesson3.c_3_1.c_3_1_3;

/**
 * Created by cch
 * 2018-04-10 11:01.
 */

public class ThreadMain {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(1000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
