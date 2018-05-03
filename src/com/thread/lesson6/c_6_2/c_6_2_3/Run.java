package com.thread.lesson6.c_6_2.c_6_2_3;

/**
 * 使用synchronized解决问题 但是效率太低
 * Created by cch
 * 2018-04-24 10:47.
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
