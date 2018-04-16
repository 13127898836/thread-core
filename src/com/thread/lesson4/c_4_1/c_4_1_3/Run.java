package com.thread.lesson4.c_4_1.c_4_1_3;

/**
 * 当没有对象监视器时，会报错java.lang.IllegalMonitorStateException
 * Created by cch
 * 2018-04-16 19:19.
 */

public class Run {
    public static void main(String[] args) {
       MyService service = new MyService();
       ThreadA a = new ThreadA(service);
       a.start();
    }
}
