package com.thread.lesson3.c_3_2.c_3_2_4;

/**
 * Created by cch
 * 2018-04-13 13:11.
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin Timer="+System.currentTimeMillis());
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
