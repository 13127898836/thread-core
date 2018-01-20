package com.thread.lesson2.c2_2.c_2_2_12;

/**
 * 多线程的死锁
 * Created by 459105408@qq.com
 * 2018-01-20 18:15.
 */

/**
 * 出现死锁，用jps看线程 id 然后执行 jstack -l id
 */
public class Run {
    public static void main(String[] args) {
        try{
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(1000);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
