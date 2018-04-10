package com.thread.lesson3.c_3_1.c_3_1_4_2;

/**
 * Created by cch
 * 2018-04-10 11:42.
 */

public class ThreadC extends Thread{
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
