package com.thread.lesson3.c_3_2.c_3_2_2;


/**
 * join具有使线程排队运作的作用，有些类似同步的运行效果。
 * join与synchronized的区别，join在内部使用wait进行等待,synchronized是使用 对象监视器 原理做同步
 * Created by cch
 * 2018-04-12 13:34.
 */

public class Test {
    public static void main(String[] args)throws Exception {

        MyThread threadTest = new MyThread();
        threadTest.start();
        threadTest.join();
        System.out.println("我想等 threadTest 执行完毕在执行,我做到了");


    }
}
