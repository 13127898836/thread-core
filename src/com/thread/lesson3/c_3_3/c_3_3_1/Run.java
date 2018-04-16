package com.thread.lesson3.c_3_3.c_3_3_1;

/**
 * Created by cch
 * 2018-04-13 15:03.
 */

public class Run {
    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if(t1.get()==null){
            System.out.println("从未获得过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
