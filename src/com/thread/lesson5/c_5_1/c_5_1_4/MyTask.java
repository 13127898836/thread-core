package com.thread.lesson5.c_5_1.c_5_1_4;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created by cch
 * 2018-04-23 21:50.
 */

public class MyTask extends TimerTask{

    @Override
    public void run() {
        System.out.println("运行了，时间："+new Date());
    }

}
