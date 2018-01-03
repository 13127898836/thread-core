package com.thread.lesson2.c2_1_2;
/**
 * Created by chenchenghao on 2018/1/3.
 */
public class Run {
    public static void main(String[] args) {
       HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        ThreadB threadB = new ThreadB(numRef);
        threadA.start();
        threadB.start();
    }
}
