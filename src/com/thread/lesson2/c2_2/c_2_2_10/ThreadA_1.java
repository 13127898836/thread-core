package com.thread.lesson2.c2_2.c_2_2_10;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 11:34.
 */

public class ThreadA_1 extends Thread{
    private Service_1 service;

    public ThreadA_1(Service_1 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print(new Object());
    }
}
