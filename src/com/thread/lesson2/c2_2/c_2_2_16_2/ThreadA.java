package com.thread.lesson2.c2_2.c_2_2_16_2;

/**
 * Created by cch
 * 2018-04-09 13:30.
 */

public class ThreadA extends Thread{
    private Service service;
    private Userinfo userinfo;

    public ThreadA(Service service, Userinfo userinfo) {
        this.service = service;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        service.serviceMethod(userinfo);
    }
}
