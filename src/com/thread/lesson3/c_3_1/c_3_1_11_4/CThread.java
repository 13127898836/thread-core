package com.thread.lesson3.c_3_1.c_3_1_11_4;

/**
 * Created by cch
 * 2018-04-11 14:01.
 */

public class CThread extends Thread{
    private C c ;

    public CThread(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true) {
            c.popService();
        }
    }
}
