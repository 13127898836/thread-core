package com.thread.lesson4.c_4_1.c_4_1_14;

/**
 * Created by cch
 * 2018-04-19 14:18.
 */

public class MyThread extends Thread{
    private Service service ;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
