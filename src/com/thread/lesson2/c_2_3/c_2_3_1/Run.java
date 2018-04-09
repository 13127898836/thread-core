package com.thread.lesson2.c_2_3.c_2_3_1;

/**
 * PrintString的方法不会停下来，因为main线程一直在处理while循环
 * Created by cch
 * 2018-04-09 13:50.
 */

public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止他，stop ThreadName:"+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
