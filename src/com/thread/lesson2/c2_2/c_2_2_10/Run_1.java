package com.thread.lesson2.c2_2.c_2_2_10;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 11:36.
 */

/**
 * 因此大多数情况同步synchronized不使用String作为锁对象，比如new Object()
 * 这个时候就交替输出信息
 */
public class Run_1 {
    public static void main(String[] args) {
        Service_1 service = new Service_1();
        ThreadA_1 a = new ThreadA_1(service);
        a.setName("a");
        a.start();
        ThreadB_1 b = new ThreadB_1(service);
        b.setName("b");
        b.start();
    }
}
