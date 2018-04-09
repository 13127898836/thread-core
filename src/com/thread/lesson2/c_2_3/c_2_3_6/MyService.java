package com.thread.lesson2.c_2_3.c_2_3_6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by cch
 * 2018-04-09 17:14.
 */

public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
   synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是:"+aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
