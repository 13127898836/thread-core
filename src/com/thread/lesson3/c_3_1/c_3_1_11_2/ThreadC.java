package com.thread.lesson3.c_3_1.c_3_1_11_2;

/**
 * Created by cch
 * 2018-04-11 12:59.
 */

public class ThreadC extends Thread {
    private C c ;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            c.getValue();
        }
    }
}
