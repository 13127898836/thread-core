package com.thread.lesson3.c_3_1.c_3_1_4;

/**
 * 根据结果可以得出 wait 会释放对象锁
 * 使用 sleep 是同步 说明没有释放对象锁
 * Created by cch
 * 2018-04-10 11:28.
 */

public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB  b = new ThreadB(lock);
        b.start();
    }
}
