package com.thread.lesson4.c_4_1.c_4_1_10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-17 13:09.
 */

public class Service3 {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void awaitMethod(){
        try{
            lock.lock();
            condition.await();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void notifyMethod(){
        try{
            lock.lock();
            System.out.println("有"+lock.getWaitQueueLength(condition)+"个线程在等待condition");
            condition.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
