package com.thread.lesson3.c_3_2.c_3_2_3;

/**
 * Created by cch
 * 2018-04-12 13:52.
 */

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在 run end 处打印");
        }catch (Exception e){
            System.out.println("线程B在 catch 处打印");
            e.printStackTrace();
        }
    }
}
