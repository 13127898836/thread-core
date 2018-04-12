package com.thread.lesson3.c_3_1.c_3_1_11;

/**
 * Created by cch
 * 2018-04-11 12:32.
 */

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
