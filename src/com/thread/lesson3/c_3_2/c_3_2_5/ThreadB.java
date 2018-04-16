package com.thread.lesson3.c_3_2.c_3_2_5;

/**
 * Created by cch
 * 2018-04-13 13:16.
 */

public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("b run timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end timer="+System.currentTimeMillis());
        }catch (Exception e){

        }
    }

    synchronized public void bService(){
        System.out.println("bservice timer="+System.currentTimeMillis());
    }
}
