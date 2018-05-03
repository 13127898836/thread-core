package com.thread.lesson5.c_5_1.c_5_1_1_3;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 19:44.
 */

public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B begin timer="+new Date());
        System.out.println("B bend timer="+new Date());
    }
}
