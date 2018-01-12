package com.thread.lesson2.c2_2.c_2_2_7_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:53.
 */

/**
 * 由于监视器不同，所以运行结果就是异步的。
 * 同步代码块，放在非synchronized方法块内，并不能保证调用方法的线程的顺序行，可能出现“脏读”
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
