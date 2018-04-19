package com.thread.lesson4.c_4_1.c_4_1_10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-17 13:00.
 */

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
            serviceMethod2();
        }finally {
            lock.unlock();
        }
    }

    private void serviceMethod2() {
        try{
            lock.lock();
            System.out.println("serviceMethod2 getHoldCOunt="+lock.getHoldCount());
        }finally {
            lock.unlock();
        }
    }
}
