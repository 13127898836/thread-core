package com.thread.lesson4.c_4_2.c_4_2_2;



/**
 * Created by cch
 * 2018-04-23 13:15.
 */

public class ThreadB extends  Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
