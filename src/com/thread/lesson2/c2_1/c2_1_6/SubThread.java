package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:40.
 */

public class SubThread extends Thread{
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateMainMethod();
    }
}
