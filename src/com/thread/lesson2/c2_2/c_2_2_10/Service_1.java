package com.thread.lesson2.c2_2.c_2_2_10;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 11:33.
 */

public class Service_1 {
    public static void print(Object object) {
        try {
            synchronized (object){
                while (true){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
