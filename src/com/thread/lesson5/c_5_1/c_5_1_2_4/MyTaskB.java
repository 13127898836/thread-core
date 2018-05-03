package com.thread.lesson5.c_5_1.c_5_1_2_4;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 20:46.
 */

public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        System.out.println("B run timer="+new Date());
    }
}
