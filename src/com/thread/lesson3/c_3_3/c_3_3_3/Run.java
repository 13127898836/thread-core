package com.thread.lesson3.c_3_3.c_3_3_3;

/**
 * 解决ThreadLocal 第一次get()返回null
 * Created by cch
 * 2018-04-13 15:25.
 */

public class Run {
    public static ThreadLocalEXT t1 = new ThreadLocalEXT();

    public static void main(String[] args) {
        if(t1.get()==null){
            System.out.println("没放过值");
            t1.set("w de zhi");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
