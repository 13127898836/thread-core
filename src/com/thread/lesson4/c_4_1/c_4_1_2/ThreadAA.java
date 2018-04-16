package com.thread.lesson4.c_4_1.c_4_1_2;

/**
 * Created by cch
 * 2018-04-16 19:04.
 */

public class ThreadAA extends Thread{
    private MyService myService;

    public ThreadAA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
