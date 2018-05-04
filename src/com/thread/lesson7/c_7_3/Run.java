package com.thread.lesson7.c_7_3;

/**
 * Created by cch
 * 2018-05-03 12:53.
 */

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock,"A",1);
        MyThread b = new MyThread(lock,"B",2);
        MyThread c = new MyThread(lock,"C",0);
        a.start();
        b.start();
        c.start();
    }
}
