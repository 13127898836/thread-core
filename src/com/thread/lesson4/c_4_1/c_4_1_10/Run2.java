package com.thread.lesson4.c_4_1.c_4_1_10;

/**
 * getQueueLength() 正在等待获取此锁的线程数
 * Created by cch
 * 2018-04-17 13:06.
 */

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        final Service2 service2 = new Service2();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod1();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] =  new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(200);
        System.out.println("有线程"+service2.lock.getQueueLength()+"在等待获取锁");

    }
}
