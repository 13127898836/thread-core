package com.thread.lesson4.c_4_1.c_4_1_13_3;

/**
 * lock.tryLock(3, TimeUnit.SECONDS)
 * 尝试在3秒内获取锁，超时就获取不到锁
 * Created by cch
 * 2018-04-19 14:12.
 */

public class Run {
    public static void main(String[] args) {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+
                "调用了waitMethod时间"+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread a  = new Thread(runnable);
        a.setName("a");
        Thread b = new Thread(runnable);
        b.setName("b");
        a.start();
        b.start();
    }
}
