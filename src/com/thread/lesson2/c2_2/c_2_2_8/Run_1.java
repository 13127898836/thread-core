package com.thread.lesson2.c2_2.c_2_2_8;


/**
 * Created by 459105408@qq.com
 * 2018-01-15 17:34.
 */

/**
 * 同步的原因是使用了同一个对象监视器。
 */
public class Run_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(service,object);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(service,object);
        threadB.setName("b");
        threadB.start();
    }
}
