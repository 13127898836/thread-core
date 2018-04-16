package com.thread.lesson4.c_4_1.c_4_1_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-16 18:51.
 */

public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+" "+(i+1));
        }
        lock.unlock();
    }
}
