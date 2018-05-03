package com.thread.lesson6.c_6_2.c_6_2_4;

/**
 * double check locking
 * 使用synchronized{} 然后里面在检查一次 是否为null 速度提升了 单例也没问题
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
