package com.thread.lesson7.c_7_1.c_7_1_2;

/**
 * Created by cch
 * 2018-04-24 12:27.
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
