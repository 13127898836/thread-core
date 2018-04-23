package com.thread.lesson4.c_4_2.c_4_2_2;



/**
 * 写锁是互斥的
 * Created by cch
 * 2018-04-23 13:22.
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
