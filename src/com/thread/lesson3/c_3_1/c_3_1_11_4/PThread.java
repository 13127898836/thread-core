package com.thread.lesson3.c_3_1.c_3_1_11_4;

/**
 * Created by cch
 * 2018-04-11 14:00.
 */

public class PThread extends Thread {
    private P p;

    public PThread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true) {
            p.pushService();
        }
    }
}
