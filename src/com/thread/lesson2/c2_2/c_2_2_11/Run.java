package com.thread.lesson2.c2_2.c_2_2_11;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 13:53.
 */

/**
 * service 中使用两个object,不在出现等待情况。
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA atherad = new ThreadA(service);
        atherad.start();
        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }
}
