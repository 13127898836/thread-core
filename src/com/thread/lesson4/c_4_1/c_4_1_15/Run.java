package com.thread.lesson4.c_4_1.c_4_1_15;

import com.thread.lesson4.c_4_1.c_4_1_14.MyThread;

/**
 * Created by cch
 * 2018-04-19 14:25.
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
