package com.thread.lesson4.c_4_1.c_4_1_15;

/**
 * Created by cch
 * 2018-04-19 14:26.
 */

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
