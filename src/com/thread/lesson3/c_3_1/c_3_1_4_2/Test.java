package com.thread.lesson3.c_3_1.c_3_1_4_2;

/**
 * notify需要等到synchronize结束释放锁 才会真的通知
 * Created by cch
 * 2018-04-10 11:45.
 */

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
    }
}
