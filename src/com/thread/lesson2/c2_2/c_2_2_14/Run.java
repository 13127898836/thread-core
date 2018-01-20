package com.thread.lesson2.c2_2.c_2_2_14;

/**
 * Created by 459105408@qq.com
 * 2018-01-20 22:36.
 */

/**
 * 由于持有不同监视器，所以是乱序的结果
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
               inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }

}
