package com.thread.lesson3.c_3_2.c_3_2_2;

/**
 * Created by cch
 * 2018-04-12 13:30.
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secondValue = (int) (Math.random()*10000);
            System.out.println(secondValue);
            Thread.sleep(secondValue);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
