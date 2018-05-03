package com.thread.lesson7.c_7_2.c_7_2_5;

/**
 * 线程组里加线程组
 * Created by cch
 * 2018-05-02 12:58.
 */

public class Run {
    public static void main(String[] args) {
        System.out.println("线程组名称："+
        Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中线程活动数量："+
        Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中线程数量-加之前"+
        Thread.currentThread().getThreadGroup().activeGroupCount());

        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(),"newGroup");

        System.out.println("线程组中线程数量-加之后"+
                Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称："+
        Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
