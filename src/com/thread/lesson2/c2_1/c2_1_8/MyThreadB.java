package com.thread.lesson2.c2_1.c2_1_8;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 9:42.
 */

public class MyThreadB extends Thread {
    private Sub sub;
    public MyThreadB(Sub sub){
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
