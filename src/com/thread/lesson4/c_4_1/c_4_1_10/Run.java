package com.thread.lesson4.c_4_1.c_4_1_10;

/**
 * getHoldCount 查询当前线程保持此锁的个数
 * Created by cch
 * 2018-04-17 13:03.
 */

public class Run {
    public static void main(String[] args) {
        Service service= new Service();
        service.serviceMethod1();
    }
}
