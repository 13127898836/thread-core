package com.thread.lesson3.c_3_2.c_3_2_6;

/**
 * join 有synchronized
 * 会和b的run 竞争
 * Created by cch
 * 2018-04-13 13:31.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        ThreadB b = new ThreadB();
        b.setName("b");
        ThreadA a = new ThreadA(b);
        a.setName("a");
        a.start();
        b.start();
        b.join(2000);
        System.out.println("main end "+System.currentTimeMillis());
    }
}
