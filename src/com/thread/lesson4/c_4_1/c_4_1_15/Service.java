package com.thread.lesson4.c_4_1.c_4_1_15;

import com.thread.lesson3.c_3_1.c_3_1_11.C;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cch
 * 2018-04-19 14:21.
 */

public class Service {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println("wait begin timer="+System.currentTimeMillis());
            condition.awaitUntil(calendar.getTime());
            System.out.println("wait end timer="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void notifyMethod(){
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND,10);
            lock.lock();
            System.out.println("notify begin timer="+System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify end timer="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
