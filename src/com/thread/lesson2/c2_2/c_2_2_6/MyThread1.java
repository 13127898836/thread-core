package com.thread.lesson2.c2_2.c_2_2_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:34.
 */

public class MyThread1 extends Thread{
    private Task task;

    public MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTask();
    }
}
