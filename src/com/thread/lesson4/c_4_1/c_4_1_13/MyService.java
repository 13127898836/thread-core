package com.thread.lesson4.c_4_1.c_4_1_13;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 13:46.
 */

public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void awitMethod(){
        try{
            lock.lockInterruptibly();
            System.out.println("lock begin"+Thread.currentThread().getName());
            for(int i=0;i<Integer.MAX_VALUE/10;i++){
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end"+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(lock.isHeldByCurrentThread()){
                lock.unlock();
            }
        }
    }

}
