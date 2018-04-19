package com.thread.lesson4.c_4_1.c_4_1_15;

/**
 * Created by cch
 * 2018-04-19 14:28.
 */

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
