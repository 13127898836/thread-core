package com.thread.lesson2.c2_2.c_2_2_9_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:54.
 */

public class ThreadC extends Thread{
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
