package com.thread.lesson4.c_4_1.c_4_1_12;

/**
 * 默认情况下 ReentrankLock 是非公平锁
 * Created by cch
 * 2018-04-19 13:34.
 */

public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        final  Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread = new Thread(runnable);
        thread.start();
    }
}
