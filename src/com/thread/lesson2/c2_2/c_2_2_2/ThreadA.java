package com.thread.lesson2.c2_2.c_2_2_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 11:52.
 */

public class ThreadA extends Thread{
    private ObjectService objectService;
    public ThreadA(ObjectService objectService){
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethod();
    }
}
