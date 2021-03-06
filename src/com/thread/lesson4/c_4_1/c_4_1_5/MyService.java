package com.thread.lesson4.c_4_1.c_4_1_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-16 20:42.
 */

public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void awaitA(){
        try{
            lock.lock();
            System.out.println("begin awaitA time"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitA time"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        try{
            lock.lock();
            System.out.println("begin awaitB time"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
            condition.await();
            System.out.println("end awaitB time"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll(){
        try{
            lock.lock();
            System.out.println(" signalAll time"+System.currentTimeMillis()+" "+Thread.currentThread().getName());
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
