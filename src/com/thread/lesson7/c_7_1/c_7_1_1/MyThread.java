package com.thread.lesson7.c_7_1.c_7_1_1;

/**
 * Created by cch
 * 2018-04-24 11:47.
 */

public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法中的状态:"+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态:"+ Thread.currentThread().getState());
    }
}
