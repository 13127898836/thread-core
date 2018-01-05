package com.thread.lesson2.c2_1.c2_1_3;
/**
 * Created by chenchenghao on 2018/1/4.
 */
public class Run {
    public static void main(String[] args) {
       HasSelfPrivateNum numRefA = new HasSelfPrivateNum();
       HasSelfPrivateNum numRefB = new HasSelfPrivateNum();
       //the different is that have two object and jvm will create two lock
        ThreadA threadA = new ThreadA(numRefA);
        ThreadB threadB = new ThreadB(numRefB);
        threadA.start();
        threadB.start();
    }
}
