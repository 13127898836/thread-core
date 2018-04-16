package com.thread.lesson4.c_4_1.c_4_1_5;

/**
 * 线程A 和B 都被唤醒 如果需要单独唤醒 需要多个Condition
 * Created by cch
 * 2018-04-16 20:49.
 */

public class Run {
    public static void main(String[] args)throws Exception{
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(300);
        service.signalAll();
    }
}
