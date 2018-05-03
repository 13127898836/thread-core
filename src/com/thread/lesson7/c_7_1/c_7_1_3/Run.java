package com.thread.lesson7.c_7_1.c_7_1_3;

/**
 * 验证blocked
 * Created by cch
 * 2018-04-24 12:47.
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        t1.setName("a");
        t1.start();
        Thread2 t2 = new Thread2();
        t2.setName("b");
        t2.start();
        Thread.sleep(100);
        System.out.println("main中t2的状态"+t2.getState());
    }
}
