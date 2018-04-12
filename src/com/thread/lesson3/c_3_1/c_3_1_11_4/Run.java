package com.thread.lesson3.c_3_1.c_3_1_11_4;

/**
 * Created by cch
 * 2018-04-11 14:04.
 */

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        PThread pThread = new PThread(p);
        CThread cThread = new CThread(c);
        pThread.start();
        cThread.start();

    }
}
