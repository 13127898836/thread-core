package com.thread.lesson5.c_5_1.c_5_1_4;

import java.util.Date;
import java.util.Timer;

/**
 * Created by cch
 * 2018-04-23 21:53.
 */

public class Run {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("当前时间"+new Date());
        timer.schedule(task,2000,3000);
    }
}
