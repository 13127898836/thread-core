package com.thread.lesson4.c_4_1.c_4_1_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-16 19:00.
 */

public class MyService {
    private Lock lock = new ReentrantLock();

    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin Threadname:"+Thread.currentThread().getName()+" time:"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("methodA end Threadname:"+Thread.currentThread().getName()+" time:"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin Threadname:"+Thread.currentThread().getName()+" time:"+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("methodB end Threadname:"+Thread.currentThread().getName()+" time:"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
