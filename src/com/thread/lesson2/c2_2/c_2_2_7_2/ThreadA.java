package com.thread.lesson2.c2_2.c_2_2_7_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:51.
 */

public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
