package com.thread.lesson4.c_4_1.c_4_1_7;

/**
 * Created by cch
 * 2018-04-17 10:21.
 */

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();

    }
}
