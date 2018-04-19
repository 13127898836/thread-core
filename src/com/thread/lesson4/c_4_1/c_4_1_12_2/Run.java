package com.thread.lesson4.c_4_1.c_4_1_12_2;

/**
 * Created by cch
 * 2018-04-19 13:40.
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
    }
}
