package com.thread.lesson3.c_3_1.c_3_1_10;

/**
 * Created by cch
 * 2018-04-11 11:21.
 */

public class ThreadAdd extends  Thread{
    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
