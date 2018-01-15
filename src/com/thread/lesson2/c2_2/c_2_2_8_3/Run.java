package com.thread.lesson2.c2_2.c_2_2_8_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 18:28.
 */

/**
 * 当其他线程执行x对象方法里面的synchronized同步方法时也是同步
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(service,object);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(object);
        threadB.setName("b");
        threadB.start();
    }
}
