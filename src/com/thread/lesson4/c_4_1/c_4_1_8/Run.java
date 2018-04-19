package com.thread.lesson4.c_4_1.c_4_1_8;


/**
 * 可能会出现连续打印，是因为只用了一个condition
 * Created by cch
 * 2018-04-17 12:01.
 */

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThreadA[] threadA= new MyThreadA[10];
        MyThreadB[] threadB= new MyThreadB[10];

        for(int i=0;i<10;i++){
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }


    }
}
