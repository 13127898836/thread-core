package com.thread.lesson6.c_6_3;

/**
 * Created by cch
 * 2018-04-24 11:03.
 */

public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){

    }
    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
