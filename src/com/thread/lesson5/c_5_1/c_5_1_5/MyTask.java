package com.thread.lesson5.c_5_1.c_5_1_5;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-24 10:04.
 */

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("begin time="+new Date());
        System.out.println("  end time="+new Date());

    }
}
