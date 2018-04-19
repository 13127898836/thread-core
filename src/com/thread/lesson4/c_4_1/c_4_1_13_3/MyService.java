package com.thread.lesson4.c_4_1.c_4_1_13_3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 14:10.
 */

public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        try{
            if(lock.tryLock(3, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName()+"获得锁的时间"+System.currentTimeMillis());
                Thread.sleep(1000);
            }else {
                System.out.println(Thread.currentThread().getName()+"没有获得锁");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }
}
