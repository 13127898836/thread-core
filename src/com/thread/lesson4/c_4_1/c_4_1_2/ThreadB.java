package com.thread.lesson4.c_4_1.c_4_1_2;

/**
 * Created by cch
 * 2018-04-16 19:02.
 */

public class ThreadB extends Thread{
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
