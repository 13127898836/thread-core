package com.thread.lesson6.c_6_4;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by cch
 * 2018-04-24 11:03.
 */

public class MyObject implements Serializable{

    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
    private MyObject(){

    }
    public static MyObject getInstance(){

        return MyObjectHandler.myObject;
    }
    protected  Object readResolve()throws ObjectStreamException{
        System.out.println("readResolve");
        return MyObjectHandler.myObject;
    }


}
