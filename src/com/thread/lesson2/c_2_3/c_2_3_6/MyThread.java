package com.thread.lesson2.c_2_3.c_2_3_6;

/**
 * Created by cch
 * 2018-04-09 17:18.
 */

public class MyThread extends Thread{
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
