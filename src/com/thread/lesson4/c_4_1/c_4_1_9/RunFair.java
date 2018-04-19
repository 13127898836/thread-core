package com.thread.lesson4.c_4_1.c_4_1_9;

/**
 * ReentrantLock(true); true 是公平锁，线程先启动的 先获得锁
 * false 非公平锁 获得锁是乱序的
 * Created by cch
 * 2018-04-17 12:55.
 */

public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(false);
        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                System.out.println("线程"+ Thread.currentThread().getName()+" come in");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for(int i=0;i<10;i++){
            threadArray[i] = new Thread(runnable);
        }
        for(int i=0;i<10;i++){
            threadArray[i].start();
        }
    }
}
