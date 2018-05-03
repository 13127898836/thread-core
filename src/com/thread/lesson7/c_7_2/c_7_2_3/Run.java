package com.thread.lesson7.c_7_2.c_7_2_3;

/**
 * 线程组自动归属特性
 * 在实例化一个ThreadGroup的时候不指名所属组，会自动归属到当前线程对象所属的线程组
 * Created by cch
 * 2018-05-02 12:42.
 */

public class Run {
    public static void main(String[] args) {
        System.out.println("A处线程"+Thread.currentThread().getName()+"所属的线程组名是："
        +Thread.currentThread().getThreadGroup().getName()+" 中有线程组数量"+
        Thread.currentThread().getThreadGroup().activeGroupCount());


        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println("B处线程"+Thread.currentThread().getName()+"所属的线程组名是："
                +Thread.currentThread().getThreadGroup().getName()+" 中有线程组数量"+
                Thread.currentThread().getThreadGroup().activeCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for(int i=0;i<threadGroup.length;i++){
            System.out.println("第一个线程组名称："+threadGroup[0].getName());
        }
    }
}
