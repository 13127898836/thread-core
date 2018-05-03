package com.thread.lesson5.c_5_1.c_5_1_2_4;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 20:44.
 */

public class MyTaskA extends TimerTask {
    @Override
    public void run() {
        System.out.println("A run timer="+new Date());
        this.cancel();
        System.out.println("A 自己移除了");
    }
}
