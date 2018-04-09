package com.thread.lesson2.c_2_3.c_2_3_3;

/**
 * jvm64位 参数 -server 会出现死循环 因为 线程的私有变量一直在用私有堆栈，而更新操作用了公共堆栈
 * Created by cch
 * 2018-04-09 14:09.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        RunThread runThread = new RunThread();
        runThread.start();
        Thread.sleep(1000);
        runThread.setRuning(false);
        System.out.println("已经赋值为false");

    }
}
