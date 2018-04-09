package com.thread.lesson2.c_2_3.c_2_3_5;

/**
 * 使用原子类 操作没有出现读脏数据
 * Created by cch
 * 2018-04-09 17:08.
 */

public class Run {
    public static void main(String[] args) {
        AddCountThread countService = new AddCountThread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();

    }
}
