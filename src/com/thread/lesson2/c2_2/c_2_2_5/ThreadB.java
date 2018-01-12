package com.thread.lesson2.c2_2.c_2_2_5;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:09.
 */

public class ThreadB extends Thread{
    private ObjectService objectService;
    public ThreadB(ObjectService objectService){
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }
}
