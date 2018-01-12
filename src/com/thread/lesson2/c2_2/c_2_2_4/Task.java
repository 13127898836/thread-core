package com.thread.lesson2.c2_2.c_2_2_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 16:16.
 */

/**
 * 当代码进入synchronized块时，需要排队执行
 */
public class Task {
    public void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized threadName="+
            Thread.currentThread().getName()+" i="+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for(int i =0;i<100;i++){
                System.out.println("synchronized threadName="+
                Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
