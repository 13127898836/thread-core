package com.thread.lesson2.c2_2.c_2_2_1;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 11:40.
 */

/**
 * synchronzied 方法的弊端
 * 运行消耗6秒
 * 使用 synchronized 关键字来声明方法 public synchronized void doLongTimeTask()从运行时间来看 弊端很明显
 * 解决这类问题应该使用synchronized同步块
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
        try{
            Thread.sleep(10000);
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
