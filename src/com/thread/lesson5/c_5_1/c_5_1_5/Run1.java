package com.thread.lesson5.c_5_1.c_5_1_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by cch
 * 2018-04-24 10:05.
 */

public class Run1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-20);
        Date date = calendar.getTime();
        System.out.println("当前时间："+new Date());
        System.out.println("计划时间："+date);
        Timer timer = new Timer();
        timer.schedule(task,date,2000);
    }
}
