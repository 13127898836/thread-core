package com.thread.lesson2.c2_1.c2_1_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:56.
 */

public class Test {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.setName("a");
            threadA.start();
            ThreadB threadB = new ThreadB(service);
            threadB.setName("b");
            threadB.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
