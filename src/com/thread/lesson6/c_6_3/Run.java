package com.thread.lesson6.c_6_3;

/**
 * 使用静态内部类 实现单例
 * Created by cch
 * 2018-04-24 11:05.
 */

public class Run {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }


}
