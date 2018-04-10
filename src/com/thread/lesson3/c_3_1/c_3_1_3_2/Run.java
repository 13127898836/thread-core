package com.thread.lesson3.c_3_1.c_3_1_3_2;

/**
 * Created by cch
 * 2018-04-10 11:14.
 */

public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            ThreadB b = new ThreadB(lock);
            b.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
