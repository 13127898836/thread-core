package com.thread.lesson6.c_6_3;

/**
 * Created by cch
 * 2018-04-24 11:05.
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(MyObject.getInstance());
    }
}
