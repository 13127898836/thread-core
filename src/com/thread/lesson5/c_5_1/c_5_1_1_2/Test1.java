package com.thread.lesson5.c_5_1.c_5_1_1_2;



import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 任务时间早于当前时间，立马执行
 * Created by cch
 * 2018-04-23 19:09.
 */

public class Test1 {
    public static void main(String[] args) {
        System.out.println("当前时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-10);
        Date runDate = calendar.getTime();
        System.out.println("执行时间:"+runDate);
        MyTask task = new MyTask();
        Timer timer = new Timer();
        timer.schedule(task,runDate);
    }
}
