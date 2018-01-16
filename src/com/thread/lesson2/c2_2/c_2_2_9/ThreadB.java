package com.thread.lesson2.c2_2.c_2_2_9;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:09.
 */

public class ThreadB extends Thread{

    @Override
    public void run() {
        Service.printB();
    }
}
