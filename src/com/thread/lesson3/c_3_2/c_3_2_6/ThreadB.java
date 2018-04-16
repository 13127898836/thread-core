package com.thread.lesson3.c_3_2.c_3_2_6;

/**
 * Created by cch
 * 2018-04-13 13:28.
 */

public class ThreadB extends  Thread {


    @Override
    synchronized  public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" run timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" run end timer="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
