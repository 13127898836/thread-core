package com.thread.lesson3.c_3_2.c_3_2_6;

/**
 * Created by cch
 * 2018-04-13 13:38.
 */

public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
        System.out.println("main end");
    }
}
