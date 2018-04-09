package com.thread.lesson2.c2_2.c_2_2_16;

/**
 *因为运行过程中，b在启动前，锁对象被修改，第二个线程能够获得锁
 * Created by cch
 * 2018-04-09 11:42.
 */

public class Run1 {

    public static void main(String[] args)throws Exception {
        MyService service = new MyService();
        ThreadA  a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
