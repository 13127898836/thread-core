package com.thread.lesson4.c_4_2.c_4_2_3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by cch
 * 2018-04-23 13:25.
 */

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read(){
        try{
            try{
                lock.readLock().lock();
                System.out.println("获得读锁"+Thread.currentThread().getName());
                Thread.sleep(3000);
            }finally {
                lock.readLock().unlock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void write(){
        try{
            try{
                lock.writeLock().lock();
                System.out.println("获得写锁"+Thread.currentThread().getName());
                Thread.sleep(3000);
            }finally {
                lock.writeLock().unlock();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
