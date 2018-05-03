package com.thread.lesson7.c_7_2.c_7_2_4;

/**
 * 获取根线程组
 * main的线程组 是system 再取其线程组就会抛空指针异常
 * Created by cch
 * 2018-05-02 12:53.
 */

public class Run {
    public static void main(String[] args) {
        System.out.println("线程："+Thread.currentThread().getName()
        +" 所在线程组名："
        +Thread.currentThread().getThreadGroup().getName());

        System.out.println("main 线程所在的线程组的父线程组的名称："
        + Thread.currentThread().getThreadGroup().getParent().getName());

        System.out.println("main 线程锁在的线程组的父线程组的父线程组名："
        +Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
