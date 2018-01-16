package com.thread.lesson2.c2_2.c_2_2_11;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 13:51.
 */

public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
