package com.thread.lesson7.c_7_2.c_7_2_6;

/**
 * 组内线程批量停止
 * Created by cch
 * 2018-05-02 13:05.
 */

public class MyThread extends Thread{
    public MyThread(ThreadGroup group,String name){
        super(group,name);
    }

    @Override
    public void run() {
        System.out.println("ThreadName= "+Thread.currentThread().getName()+
        " 准备开始死循环");
        while(!this.isInterrupted()){

        }
        System.out.println("ThreadName=" +Thread.currentThread().getName()+
        "结束了");
    }
}
