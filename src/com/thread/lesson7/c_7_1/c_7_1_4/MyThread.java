package com.thread.lesson7.c_7_1.c_7_1_4;

/**
 * Created by cch
 * 2018-04-24 12:53.
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        try{
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        }catch (Exception e){

        }
    }
}
