package com.thread.lesson2.c2_2.c_2_2_16;

/**
 * 因为运行过程中，锁对象是同一个，第二个线程需要等待
 * Created by cch
 * 2018-04-09 13:22.
 */

public class Run2 {
    public static void main(String[] args)throws Exception {
        MyService service = new MyService();
        ThreadA  a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
