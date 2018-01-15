package com.thread.lesson2.c2_2.c_2_2_8;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 17:40.
 */

/**
 * 当对象监视器不是同一个时，为异步运行
 */
public class Run_2 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object1 = new MyObject();
        MyObject object2 = new MyObject();
        ThreadA threadA = new ThreadA(service,object1);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service,object2);
        threadB.setName("B");
        threadB.start();
    }
}
