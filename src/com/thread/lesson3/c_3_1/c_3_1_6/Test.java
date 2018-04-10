package com.thread.lesson3.c_3_1.c_3_1_6;

/**
 * notify 是随机唤醒一个线程
 * notifyAll 唤醒所有
 * Created by cch
 * 2018-04-10 16:50.
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();

    }
}
