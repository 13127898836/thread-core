package com.thread.lesson6.c_6_1;

/**
 * 输出对象地址一样 说明都是同一个对象
 * Created by cch
 * 2018-04-24 10:34.
 */

public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        MyThread b = new MyThread();
        MyThread c = new MyThread();
        a.start();
        b.start();
        c.start();
    }
}
