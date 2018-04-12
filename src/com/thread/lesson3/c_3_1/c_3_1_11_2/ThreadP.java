package com.thread.lesson3.c_3_1.c_3_1_11_2;

/**
 * Created by cch
 * 2018-04-11 12:58.
 */

public class ThreadP extends Thread{
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true) {
            p.setValue();
        }
    }
}
