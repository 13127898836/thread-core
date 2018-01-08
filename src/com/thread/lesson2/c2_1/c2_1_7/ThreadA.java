package com.thread.lesson2.c2_1.c2_1_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:54.
 */

public class ThreadA extends  Thread {
    private Service service;
    public ThreadA(Service service){
        this.service =service;
    }
    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
