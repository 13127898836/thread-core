package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:41.
 */

/**
 * 当存在父子继承关系时，子类完全可以通过“可重入锁”调用父类的同步方法
 */
public class SubRun {

    public static void main(String[] args) {
       SubThread t = new SubThread();
       t.start();
    }
}
