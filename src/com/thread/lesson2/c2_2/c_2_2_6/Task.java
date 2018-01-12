package com.thread.lesson2.c2_2.c_2_2_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:30.
 */

public class Task {
    public synchronized void otherMethod(){
        System.out.println("--------------run-otherMethod");
    }
    public void doLongTask(){
        synchronized (this){
            for(int i=0;i<10000;i++){
                System.out.println("synchronized threadName="+
                Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
