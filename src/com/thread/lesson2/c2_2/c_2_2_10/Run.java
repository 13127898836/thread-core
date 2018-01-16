package com.thread.lesson2.c2_2.c_2_2_10;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 11:36.
 */

/**
 * 一直输出a，出现这种情况是因为String的两个值都是AA，两个线程持有相同的锁，所以造成B线程不能执行。
 * 这是String常量池带来的问题。因此大多数情况同步synchronized不使用String作为锁对象，比如new Object()
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
