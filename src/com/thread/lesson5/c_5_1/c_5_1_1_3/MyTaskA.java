package com.thread.lesson5.c_5_1.c_5_1_1_3;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 19:15.
 */

public class MyTaskA extends TimerTask {
    @Override
    public void run() {

        try {
            System.out.println("A begin timer="+new Date());
            Thread.sleep(12000);
            System.out.println("A end timer="+new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
