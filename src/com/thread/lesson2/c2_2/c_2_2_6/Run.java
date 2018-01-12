package com.thread.lesson2.c2_2.c_2_2_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:36.
 */

/**
 * 当otherMethod为同步时，需要等doLongTask完成，
 * 当otherMethod没有同步时，是异步完成的，
 * 说明synchronized(this)是锁当前对象的。
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
