package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-05 9:56.
 */

public class Run {
    /**
     * 可重入锁：自己可以再次获得自己内部的锁。
     * 比如线程A获得某个对象的锁，此时对象锁还没有释放，当再次要获取这个对象的锁时候，还是可以获取的，如果不可锁重入话，会造成死锁。
     * @param args
     */
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
