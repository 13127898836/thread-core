package com.thread.lesson3.c_3_1.c_3_1_10;

/**
 * 把 subtract 中的while 改为if 会报错
 * Created by cch
 * 2018-04-11 11:23.
 */

public class Run {
    public static void main(String[] args) throws Exception{
        String lock = new String ("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("s1");
        threadSubtract.start();

        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("s2");
        threadSubtract2.start();

        Thread.sleep(1000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("add");
        threadAdd.start();
    }
}
