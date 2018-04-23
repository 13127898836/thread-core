package com.thread.lesson4.c_4_2.c_4_2_1;


import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by cch
 * 2018-04-20 17:51.
 */

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try{
            try{
               lock.readLock().lock();
                System.out.println("获得读锁"+Thread.currentThread().getName());
                Thread.sleep(10000);
            }finally {
                lock.readLock().unlock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
