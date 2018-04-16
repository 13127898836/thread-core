package com.thread.lesson4.c_4_1.c_4_1_6;

/**
 * Created by cch
 * 2018-04-16 20:48.
 */

public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
