package com.thread.lesson2.c2_2.c_2_2_1;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 11:38.
 */

public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        Commoutils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        Commoutils.endTime2 = System.currentTimeMillis();
    }
}
