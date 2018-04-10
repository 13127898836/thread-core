package com.thread.lesson3.c_3_1.c_3_1_3_2;

/**
 * Created by cch
 * 2018-04-10 11:10.
 */

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                MyList.add();
                synchronized (lock) {
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("发出通知");
                    }
                    System.out.println("增加了" + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {

        }
    }
}
