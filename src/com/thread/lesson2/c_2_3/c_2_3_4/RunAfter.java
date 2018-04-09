package com.thread.lesson2.c_2_3.c_2_3_4;

/**
 * 对方法加入synchronize 就没必要使用 volatile关键字申明count
 * Created by cch
 * 2018-04-09 16:58.
 */

public class RunAfter {
    public static void main(String[] args) {
        MyThreadAfter[] before = new MyThreadAfter[100];
        for(int i=0;i<100;i++){
            before[i] = new MyThreadAfter();
        }
        for(int i=0;i<100;i++){
            before[i].start();
        }
    }
}
