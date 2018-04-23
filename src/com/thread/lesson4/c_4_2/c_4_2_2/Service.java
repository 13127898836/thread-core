package com.thread.lesson4.c_4_2.c_4_2_2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by cch
 * 2018-04-23 13:19.
 */

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void write(){
        try{
            try{
                lock.writeLock().lock();
                System.out.println("获得写锁"+Thread.currentThread().getName());
                Thread.sleep(10000);
            }finally {
                lock.writeLock().unlock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
