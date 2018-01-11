package com.thread.lesson2.c2_2.c_2_2_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 12:45.
 */

/**
 * synchronized同步代码块的使用
 * 虽然使用了synchronized同步代码块，但是执行效率还是没有提高，执行的效果还是同步运行的。
 */
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("a");
        threadA.start();
        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("b");
        threadB.start();
    }
}
