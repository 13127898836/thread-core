package com.thread.lesson2.c2_2.c_2_2_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:33.
 */

/**
 * 当anyString 是Service的属性时，代码会同步
 * 当anyStirng 是局部变量时，也就是 非this的对象，代码是异步的
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
