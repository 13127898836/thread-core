package com.thread.lesson3.c_3_1.c_3_1_5;

/**
 * Created by cch
 * 2018-04-10 16:36.
 */

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait" + System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait" + System.currentTimeMillis());
            }
        }catch (Exception e){
            System.out.println("出现异常了,因为wait状态的线程被interrupt了");
        }
    }
}
