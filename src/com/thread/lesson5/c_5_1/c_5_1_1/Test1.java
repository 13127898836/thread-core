package com.thread.lesson5.c_5_1.c_5_1_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 因为timer 默认不是 守护进程，所以定时任务结束，线程没有结束
 * Timer timer = new Timer(true) 设置为守护进程，定时任务还没执行 线程就结束了
 * Created by cch
 * 2018-04-23 19:00.
 */

public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runDate = calendar.getTime();
        MyTask task = new MyTask();
        Timer timer = new Timer(true);
        timer.schedule(task,runDate);
    }
}
