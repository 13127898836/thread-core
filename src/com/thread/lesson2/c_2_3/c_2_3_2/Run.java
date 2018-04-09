package com.thread.lesson2.c_2_3.c_2_3_2;

/**
 * 注意 这种代码格式在-server服务器模式中64bit的jvm上回出现死循环
 * Created by cch
 * 2018-04-09 13:57.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        Thread.sleep(3000);
        System.out.println("我要停止他，stop ThreadName:"+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
