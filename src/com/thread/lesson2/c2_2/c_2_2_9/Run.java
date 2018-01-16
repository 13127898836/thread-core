package com.thread.lesson2.c2_2.c_2_2_9;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 10:09.
 */

/**
 * 关键词synchronized可以用在static静态方法上，这将会是对Class类进行持锁。
 * synchronized关键词加到static和非static还是有本质区别，一个是给类上锁，一个是给对象。
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("b");
        b.start();
    }
}
