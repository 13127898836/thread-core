package com.thread.lesson2.c2_2.c_2_2_16_2;

/**
 * 修改对象的属性 并不能使锁失效，必须修改对象才可以
 * Created by cch
 * 2018-04-09 13:30.
 */

public class Run {
    public static void main(String[] args)throws Exception {
        Service service = new Service();
        Userinfo userinfo = new Userinfo("a","b");
        ThreadA a = new ThreadA(service,userinfo);
        a.setName("A");
        ThreadB b = new ThreadB(service,userinfo);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
