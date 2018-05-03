package com.thread.lesson7.c_7_1.c_7_1_3;

/**
 * Created by cch
 * 2018-04-24 12:46.
 */

public class Thread2 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
