package com.thread.lesson5.c_5_1.c_5_1_2;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 19:54.
 */

public class MyTask  extends TimerTask{

    @Override
    public void run() {
        System.out.println("任务执行了，时间："+new Date());
    }
}
