package com.thread.lesson2.c2_2.c_2_2_16;

/**
 * Created by cch
 * 2018-04-09 11:42.
 */

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService myService){
        super();
        this.service = myService;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
