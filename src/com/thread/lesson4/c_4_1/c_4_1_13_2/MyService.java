package com.thread.lesson4.c_4_1.c_4_1_13_2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 14:05.
 */

public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得了锁");
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
