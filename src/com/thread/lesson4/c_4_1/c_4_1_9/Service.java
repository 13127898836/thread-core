package com.thread.lesson4.c_4_1.c_4_1_9;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-17 12:52.
 */

public class Service {
    private ReentrantLock lock;
    public Service (boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁");
        }finally {
            lock.unlock();
        }
    }
}
