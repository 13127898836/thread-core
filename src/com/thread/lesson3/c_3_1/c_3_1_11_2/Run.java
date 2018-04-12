package com.thread.lesson3.c_3_1.c_3_1_11_2;

/**
 * 多生产者 多消费者 会出现假死把 notify 改为 notifyAll
 * Created by cch
 * 2018-04-11 12:59.
 */

public class Run {
    public static void main(String[] args) throws Exception{
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP[] pThread = new ThreadP[2];
        ThreadC[] cThread = new ThreadC[2];
        for(int i =0;i<2;i++){
            pThread[i] = new ThreadP(p);
            pThread[i].setName("P"+i);
            cThread[i] = new ThreadC(c);
            cThread[i].setName("C"+i);
            pThread[i].start();
            cThread[i].start();
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);
        for(int i =0;i<threadArray.length;i++){
            System.out.println(threadArray[i].getName()+" "+threadArray[i].getState());
        }
    }
}
