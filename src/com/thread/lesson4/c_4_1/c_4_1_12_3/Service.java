package com.thread.lesson4.c_4_1.c_4_1_12_3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 13:43.
 */

public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            System.out.println(lock.isLocked());
            lock.lock();
            System.out.println(lock.isLocked());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
