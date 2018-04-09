package com.thread.lesson2.c_2_3.c_2_3_4;

/**
 * Created by cch
 * 2018-04-09 16:14.
 */

public class MyThreadBefore extends Thread{
    volatile public static int count;
    private static void addCount(){
        for (int i=0;i<100;i++){
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
