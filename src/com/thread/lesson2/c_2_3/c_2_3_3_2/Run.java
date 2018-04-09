package com.thread.lesson2.c_2_3.c_2_3_3_2;



/**
 * volatile 关键字增加了实例变量在多线程之间的可见性，但是最致命的缺点是不支持原子性。
 * Created by cch
 * 2018-04-09 16:02.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        RunThread runThread = new RunThread();
        runThread.start();
        Thread.sleep(1000);
        runThread.setRunning(false);
        System.out.println("已经赋值为false");
    }
}
