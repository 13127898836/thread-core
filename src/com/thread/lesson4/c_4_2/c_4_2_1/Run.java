package com.thread.lesson4.c_4_2.c_4_2_1;

/**
 * 读写锁，多个读锁不互斥，读锁和写锁互斥，写锁和写锁互斥
 * Created by cch
 * 2018-04-20 17:56.
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
