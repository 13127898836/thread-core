package com.thread.lesson4.c_4_1.c_4_1_1;

/**
 * Created by cch
 * 2018-04-16 18:55.
 */

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
