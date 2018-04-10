package com.thread.lesson3.c_3_1.c_3_1_5;

/**
 *
 * Created by cch
 * 2018-04-10 16:39.
 */

public class Test {
    public static void main(String[] args) throws Exception{
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        Thread.sleep(2000);
        a.interrupt();
    }
}
