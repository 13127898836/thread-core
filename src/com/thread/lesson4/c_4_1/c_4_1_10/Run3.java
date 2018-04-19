package com.thread.lesson4.c_4_1.c_4_1_10;

/**
 * getAwaitLength(Condition condition) 等待此锁相关condition的线程数
 * Created by cch
 * 2018-04-17 13:12.
 */

public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        final Service3 service3 = new Service3();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service3.awaitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] =  new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(300);
        service3.notifyMethod();
    }
}
