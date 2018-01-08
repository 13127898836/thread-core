package com.thread.lesson2.c2_1.c2_1_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-04 10:07.
 */

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
