package com.thread.lesson4.c_4_1.c_4_1_13;

/**
 * lock.lock()换成
 * lock.lockInterruptibly(); 在线程被打断时候 会报异常
 * Created by cch
 * 2018-04-19 13:48.
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.awitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");

    }
}
