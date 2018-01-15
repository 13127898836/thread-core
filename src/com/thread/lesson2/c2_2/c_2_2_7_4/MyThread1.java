package com.thread.lesson2.c2_2.c_2_2_7_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:54.
 */

public class MyThread1 extends Thread{
    private MyOneList list;

    public MyThread1(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list,"A");
    }
}
