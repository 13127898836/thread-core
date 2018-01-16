package com.thread.lesson2.c2_2.c_2_2_9_2;


/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:21.
 */

public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
