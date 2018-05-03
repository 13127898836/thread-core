package com.thread.lesson5.c_5_1.c_5_1_3;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 21:38.
 */

public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行时间:"+new Date());
        }

        public static void main(String[] args) {
            MyTask myTask = new MyTask();
            Timer timer = new Timer();
            timer.schedule(myTask,5000);
        }
    }
}
