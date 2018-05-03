package com.thread.lesson6.c_6_1;

/**
 * Created by cch
 * 2018-04-24 10:12.
 */

public class MyObject {
    private static MyObject myObject = new MyObject();
    private MyObject(){

    }
    public static MyObject getInstance(){
        //饿汉模式
        //此代码缺点是不能有两个实例
        //因为没有加同步可能出现非线程安全问题
        return myObject;
    }
}
