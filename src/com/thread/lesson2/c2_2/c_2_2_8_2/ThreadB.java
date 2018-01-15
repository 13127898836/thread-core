package com.thread.lesson2.c2_2.c_2_2_8_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 18:27.
 */

public class ThreadB extends Thread{
    private MyObject object;

    public ThreadB( MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.speedPrintString();
    }
}
