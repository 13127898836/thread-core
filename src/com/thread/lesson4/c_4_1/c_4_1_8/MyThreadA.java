package com.thread.lesson4.c_4_1.c_4_1_8;



/**
 * Created by cch
 * 2018-04-17 10:19.
 */

public class MyThreadA extends Thread{
    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {

            service.set();

    }
}
