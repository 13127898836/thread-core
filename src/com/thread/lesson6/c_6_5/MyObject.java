package com.thread.lesson6.c_6_5;

/**
 * Created by cch
 * 2018-04-24 11:28.
 */

public class MyObject {
    private static MyObject myObject=null;
    private MyObject(){

    }
    static {
        myObject = new MyObject();
    }
    public static MyObject getInstance(){
        return myObject;
    }
}
