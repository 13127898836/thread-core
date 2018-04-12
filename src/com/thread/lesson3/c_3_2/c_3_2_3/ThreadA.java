package com.thread.lesson3.c_3_2.c_3_2_3;

/**
 * Created by cch
 * 2018-04-12 13:49.
 */

public class ThreadA extends Thread{
    @Override
    public void run() {
        for(int i=0;i<Integer.MAX_VALUE;i++){
            String newString = new String();
            Math.random();
        }
    }
}
