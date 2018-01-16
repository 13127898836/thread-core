package com.thread.lesson2.c2_2.c_2_2_9_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 11:23.
 */

/**
 * Class锁对所有对象实例起作用
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("b");
        b.start();
    }
}
