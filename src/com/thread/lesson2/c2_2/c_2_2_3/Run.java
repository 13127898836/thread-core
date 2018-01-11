package com.thread.lesson2.c2_2.c_2_2_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 11:40.
 */


/**
 * 同步代码块解决同步方法的弊端
 * 当一个线程访问object的一个synchronized同步代码块时，另一个线程可以访问该object对象中的非synchronized(this)代码。
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        long begainTime = Commoutils.beginTime1;
        if(Commoutils.beginTime2 < Commoutils.beginTime1){
            begainTime = Commoutils.beginTime2;
        }
        long endTime = Commoutils.endTime1;
        if(Commoutils.endTime2> Commoutils.endTime1){
            endTime = Commoutils.endTime2;
        }
        System.out.println("耗时:"+((endTime-begainTime)/1000));
    }
}
