package com.thread.lesson2.c2_2.c_2_2_9_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:59.
 */

/**
 * c是异步的，一个是对象锁，一个是Class锁。Class锁的对类的所有实例对象其作用。
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("c");
        c.start();
    }
}
