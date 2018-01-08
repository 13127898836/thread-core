package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-05 9:55.
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
