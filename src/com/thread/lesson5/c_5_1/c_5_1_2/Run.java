package com.thread.lesson5.c_5_1.c_5_1_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 1 晚于当前时间的，到时候了开始执行，每隔4秒执行一次
 * 2 早于当前时间的，立即执行，每隔4秒执行一次
 * 3 执行任务时长超过间隔时间，会导致执行间隔变长
 * Created by cch
 * 2018-04-23 19:56.
 */

public class Run {
    public static void main(String[] args) {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate = calendar.getTime();
        System.out.println("计划时间："+runDate);
        MyTask myTask = new MyTask();
        Timer  timer = new Timer();
        timer.schedule(myTask,runDate,4000);
    }
}
