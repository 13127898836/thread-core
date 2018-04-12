package com.thread.lesson3.c_3_2.c_3_2_1;

/**
 * Created by cch
 * 2018-04-12 13:34.
 */

public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        //Thread.sleep(?)
        System.out.println("我想等 threadTest 执行完毕在执行");
        System.out.println("sleep 多久不能确定");

    }
}
