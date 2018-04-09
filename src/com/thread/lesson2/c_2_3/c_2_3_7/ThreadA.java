package com.thread.lesson2.c_2_3.c_2_3_7;

/**
 * Created by cch
 * 2018-04-09 17:45.
 */

public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
