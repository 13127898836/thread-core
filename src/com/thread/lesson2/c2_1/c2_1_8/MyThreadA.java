package com.thread.lesson2.c2_1.c2_1_8;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 9:40.
 */

public class MyThreadA extends Thread {
    private Sub sub;
    public MyThreadA(Sub sub){
        this.sub = sub;
    }
    @Override
    public void run() {
        sub.serviceMethod();
    }
}
