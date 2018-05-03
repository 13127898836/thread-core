package com.thread.lesson6.c_6_2.c_6_2_2;

/**
 * Created by cch
 * 2018-04-24 10:36.
 */

public class MyObject {
    private static MyObject object;
    private MyObject(){

    }
    public static MyObject getInstance(){
        //懒汉模式 延迟加载 在多线程会出现多个实例
        if(object==null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            object= new MyObject();
        }
        return object;
    }
}
