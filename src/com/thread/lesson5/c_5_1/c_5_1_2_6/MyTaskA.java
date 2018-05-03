package com.thread.lesson5.c_5_1.c_5_1_2_6;

import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 21:21.
 */

public class MyTaskA extends TimerTask {
    private int i;

    public MyTaskA(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("i="+i);
    }
}
