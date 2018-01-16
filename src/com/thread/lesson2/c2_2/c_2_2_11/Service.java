package com.thread.lesson2.c2_2.c_2_2_11;

/**
 * Created by 459105408@qq.com
 * 2018-01-16 13:39.
 */

public class Service {
    //修改前
  /*  synchronized public void methodA(){
        System.out.println("methodA begin");
        boolean isCOntineRun = true;
        while(isCOntineRun){

        }
        System.out.println("methodA end");
    }

    synchronized public void methodB(){
        System.out.println("methodB begain");
        System.out.println("methodB end");
    }*/
    Object object1 = new Object();
    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun){

            }
            System.out.println("methodA end");
        }
    }
    Object object2 = new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
