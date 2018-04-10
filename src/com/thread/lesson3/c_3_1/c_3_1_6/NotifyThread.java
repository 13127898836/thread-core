package com.thread.lesson3.c_3_1.c_3_1_6;

/**
 * Created by cch
 * 2018-04-10 16:48.
 */

public class NotifyThread extends Thread{
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();
            lock.notify();
            lock.notify();
            lock.notify();
            lock.notify();
        }
    }
}
