package com.thread.lesson3.c_3_4.c_3_4_1;

/**
 * Created by cch
 * 2018-04-13 15:40.
 */

public class ThreadA extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA get value" + Tools.t1.get());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
