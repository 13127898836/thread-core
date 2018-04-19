package com.thread.lesson4.c_4_1.c_4_1_12_2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 13:38.
 */

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            System.out.println(lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println(lock.isHeldByCurrentThread());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
