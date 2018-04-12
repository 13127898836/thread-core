package com.thread.lesson3.c_3_1.c_3_1_10;

/**
 * Created by cch
 * 2018-04-11 11:22.
 */

public class ThreadSubtract extends Thread{
    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
