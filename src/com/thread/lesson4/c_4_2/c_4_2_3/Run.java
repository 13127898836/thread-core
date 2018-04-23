package com.thread.lesson4.c_4_2.c_4_2_3;

/**
 * 读写操作是互斥的 写读操作也是互斥的
 * Created by cch
 * 2018-04-23 13:28.
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
       /* a.start();
        Thread.sleep(200);
        b.start();*/
       b.start();
       Thread.sleep(200);
       a.start();
    }
}
