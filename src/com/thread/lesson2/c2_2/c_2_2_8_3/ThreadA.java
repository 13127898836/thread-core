package com.thread.lesson2.c2_2.c_2_2_8_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 18:25.
 */

public class ThreadA extends Thread{
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        service.testMethod1(object);
    }
}
