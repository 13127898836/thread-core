package com.thread.lesson2.c_2_3.c_2_3_4;

/**
 * 因为count++是非原子性的，所以会出现脏读
 * Created by cch
 * 2018-04-09 16:16.
 */

public class RunBefore {
    public static void main(String[] args) {
        MyThreadBefore[] before = new MyThreadBefore[100];
        for(int i=0;i<100;i++){
            before[i] = new MyThreadBefore();
        }
        for(int i=0;i<100;i++){
            before[i].start();
        }
    }
}
