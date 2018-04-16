package com.thread.lesson3.c_3_2.c_3_2_5;

/**
 * Created by cch
 * 2018-04-13 13:19.
 */

public class ThreadC extends Thread {
    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
