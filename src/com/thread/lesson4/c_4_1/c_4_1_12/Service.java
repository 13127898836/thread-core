package com.thread.lesson4.c_4_1.c_4_1_12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 13:28.
 */

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("公平锁情况："+lock.isFair());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
