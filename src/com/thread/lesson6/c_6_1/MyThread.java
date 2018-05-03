package com.thread.lesson6.c_6_1;

/**
 * Created by cch
 * 2018-04-24 10:14.
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance());
    }
}
