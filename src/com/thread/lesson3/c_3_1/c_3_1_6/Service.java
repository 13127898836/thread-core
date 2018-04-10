package com.thread.lesson3.c_3_1.c_3_1_6;

/**
 * Created by cch
 * 2018-04-10 16:46.
 */

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName()+" begin wait" + System.currentTimeMillis());
                lock.wait();
                System.out.println(Thread.currentThread().getName()+" end wait" + System.currentTimeMillis());
            }
        }catch (Exception e){
            System.out.println("出现异常了,因为wait状态的线程被interrupt了");
        }
    }
}
