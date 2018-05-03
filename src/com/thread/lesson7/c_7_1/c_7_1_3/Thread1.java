package com.thread.lesson7.c_7_1.c_7_1_3;

/**
 * Created by cch
 * 2018-04-24 12:44.
 */

public class Thread1  extends Thread{
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
