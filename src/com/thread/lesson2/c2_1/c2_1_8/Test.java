package com.thread.lesson2.c2_1.c2_1_8;


/**
 * Created by 459105408@qq.com
 * 2018-01-09 9:44.
 */

public class Test {
    public static void main(String[] args) {
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
