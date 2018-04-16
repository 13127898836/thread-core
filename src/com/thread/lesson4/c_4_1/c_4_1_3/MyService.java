package com.thread.lesson4.c_4_1.c_4_1_3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * Created by cch
 * 2018-04-16 19:15.
 */

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try{
           // lock.lock();
            System.out.println("-----");
            condition.await();
            System.out.println("-----");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
