package com.thread.lesson4.c_4_1.c_4_1_2;

/**
 * 使用了lock 就会持有 对象监视器 ，其他线程只能等待锁的释放
 * Created by cch
 * 2018-04-16 19:05.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        a.start();
        aa.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        b.start();
        bb.start();
    }
}
