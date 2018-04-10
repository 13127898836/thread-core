package com.thread.lesson3.c_3_1.c_3_1_1;

/**
 *在MyList中没加volatile 会出现死循环 原因是 可观性问题
 * Created by cch
 * 2018-04-10 10:11.
 */

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
