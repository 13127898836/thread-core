package com.thread.lesson4.c_4_1.c_4_1_4;

/**
 * 使用 condition 实现等待/通知
 * Created by cch
 * 2018-04-16 19:33.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(1000);
        service.signal();
    }
}
