package com.thread.lesson7.c_7_2.c_7_2_1;

/**
 * Created by cch
 * 2018-04-24 13:30.
 */

public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
