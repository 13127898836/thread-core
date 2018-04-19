package com.thread.lesson4.c_4_1.c_4_1_11_2;

/**
 * Created by cch
 * 2018-04-19 13:23.
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] = new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
