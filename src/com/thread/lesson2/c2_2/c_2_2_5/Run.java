package com.thread.lesson2.c2_2.c_2_2_5;

/**
 * Created by 459105408@qq.com
 * 2018-01-11 13:14.
 */

/**
 * 在使用synchronized（this） 代码块需要注意，当一个线程访问object synchronized(this)代码块时候，
 * 其他线程对同一个object中所有其他 synchronized(this)代码块的访问被阻塞，说明synchronized使用的“对象监视器”是同一个。
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
