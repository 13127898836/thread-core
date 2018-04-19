package com.thread.lesson4.c_4_1.c_4_1_7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-17 10:14.
 */

public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set(){
        try{
            lock.lock();
            while(hasValue){
                condition.await();
            }
            System.out.println("-----------------");
            hasValue=true;
            condition.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try{
            lock.lock();
            while (!hasValue){
                condition.await();
            }
            System.out.println("+++++++++++++++++++");
            hasValue=false;
            condition.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
