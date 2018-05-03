package com.thread.lesson5.c_5_1.c_5_1_2_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * TimeTask 的 cancel（） 是把自己移出任务队列
 * Timer的 cancle（）全部任务清楚，并且进程被销毁
 * Created by cch
 * 2018-04-23 21:04.
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("计划时间："+date);
        MyTaskA taskA = new MyTaskA();
        MyTaskB taskB = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(taskA,date,4000);
        timer.schedule(taskB,date,4000);
        Thread.sleep(10000);
        timer.cancel();
    }
}
