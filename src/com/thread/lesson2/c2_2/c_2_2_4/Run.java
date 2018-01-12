package com.thread.lesson2.c2_2.c_2_2_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 11:47.
 */

public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.setName("thread1");
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.setName("thread2");
        thread2.start();
    }
}
