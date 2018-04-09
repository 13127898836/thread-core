package com.thread.lesson2.c_2_3.c_2_3_7;

/**
 *jvm参数 -server出现死循环
 * Created by cch
 * 2018-04-09 17:48.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(service);
        b.start();
        System.out.println("已经发起停止的命令");
    }
}
