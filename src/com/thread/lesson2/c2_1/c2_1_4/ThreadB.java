package com.thread.lesson2.c2_1.c2_1_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-04 10:04.
 */

public class ThreadB extends Thread{
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
