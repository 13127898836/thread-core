package com.thread.lesson2.c2_2.c_2_2_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:36.
 */

public class MyThread2 extends Thread{
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
