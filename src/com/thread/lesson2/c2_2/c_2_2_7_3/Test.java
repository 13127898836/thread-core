package com.thread.lesson2.c2_2.c_2_2_7_3;


/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:43.
 */

/**
 * 当A和B执行带有分支判断的方法时，会出现逻辑错误，有可能读脏数据。
 */
public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(myList);
        b.setName("B");
        b.start();

    }
}
