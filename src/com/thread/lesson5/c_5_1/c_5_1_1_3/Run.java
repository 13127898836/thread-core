package com.thread.lesson5.c_5_1.c_5_1_1_3;

import com.thread.lesson3.c_3_1.c_3_1_11.C;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Timer中的task 其实是放入队列中的，必须等上一个执行完，所以会出现 超过执行时间 还没开始执行的情况
 * Created by cch
 * 2018-04-23 19:45.
 */

public class Run {
    public static void main(String[] args) {
        System.out.println("时间："+new Date());
        Calendar calendar1 = Calendar.getInstance();
        Date date = calendar1.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.SECOND,10);
        Date date2 = calendar2.getTime();
        System.out.println("A 计划时间："+date);
        System.out.println("B 计划时间："+date2);
        MyTaskA taskA = new MyTaskA();
        MyTaskB taskB = new MyTaskB();
        Timer timer = new Timer();
        timer.schedule(taskA,date);
        timer.schedule(taskB,date2);

    }
}
