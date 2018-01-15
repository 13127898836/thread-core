package com.thread.lesson2.c2_2.c_2_2_7_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:57.
 */

public class MyThread2 extends Thread{
    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list,"B");
    }
}
