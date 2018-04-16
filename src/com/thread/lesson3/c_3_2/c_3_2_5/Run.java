package com.thread.lesson3.c_3_2.c_3_2_5;

/**
 * sleep 方法不会释放锁
 * join 方法会释放锁
 * Created by cch
 * 2018-04-13 13:20.
 */

public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b =new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
