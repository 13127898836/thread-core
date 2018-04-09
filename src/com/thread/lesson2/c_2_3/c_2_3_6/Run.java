package com.thread.lesson2.c_2_3.c_2_3_6;

/**
 *
 * Created by cch
 * 2018-04-09 17:17.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        MyService myService = new MyService();
        MyThread[] array = new MyThread[5];
        for(int i=0;i<array.length;i++){
            array[i] = new MyThread(myService);
        }
        for(int i=0;i<array.length;i++){
            array[i].start();
        }
        Thread.sleep(1000);
        System.out.println(myService.aiRef.get());
    }
}
