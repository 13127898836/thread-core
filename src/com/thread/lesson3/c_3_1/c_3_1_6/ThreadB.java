package com.thread.lesson3.c_3_1.c_3_1_6;

/**
 * Created by cch
 * 2018-04-10 16:47.
 */

public class ThreadB extends Thread{
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
