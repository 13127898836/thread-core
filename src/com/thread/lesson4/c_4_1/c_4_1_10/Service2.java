package com.thread.lesson4.c_4_1.c_4_1_10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-17 13:04.
 */

public class Service2 {
    public ReentrantLock lock = new ReentrantLock();
    public void serviceMethod1(){
        try{
            lock.lock();
            System.out.println("ThreadName:"+Thread.currentThread().getName()+" come in");
            Thread.sleep(Integer.MAX_VALUE);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
