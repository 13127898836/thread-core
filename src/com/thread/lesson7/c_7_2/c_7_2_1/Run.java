package com.thread.lesson7.c_7_2.c_7_2_1;

/**
 * 线程对象关联线程组：1级关联
 * Created by cch
 * 2018-04-24 13:32.
 */

public class Run {
    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();
        ThreadGroup group = new ThreadGroup("cch的线程组");
        Thread threadA = new Thread(group,aRunnable);
        Thread threadB = new Thread(group,bRunnable);
        threadA.start();
        threadB.start();
        System.out.println("活动的线程数 "+group.activeCount());
        System.out.println("线程组的名称 "+group.getName());

    }
}
