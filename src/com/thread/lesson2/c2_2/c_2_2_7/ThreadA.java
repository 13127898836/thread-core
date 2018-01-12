package com.thread.lesson2.c2_2.c_2_2_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:29.
 */

public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernameParam("a","aa");
    }
}
