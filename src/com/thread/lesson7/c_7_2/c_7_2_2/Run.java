package com.thread.lesson7.c_7_2.c_7_2_2;

/**
 * Created by cch
 * 2018-04-24 13:43.
 */

public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup,"A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runMethod");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread newThread = new Thread(group,runnable);
        newThread.setName("z");
        newThread.start();

        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("main线程中有多少个字线程组"+listGroup.length+"名字："+listGroup[0].getName());
        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }
}
