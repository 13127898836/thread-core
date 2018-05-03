package com.thread.lesson7.c_7_1.c_7_1_1;

/**
 * 验证 new runnable terminated
 * Created by cch
 * 2018-04-24 11:48.
 */

public class Run {
    //NEW
    //RUNNABLE
    //TERMINATED
    //BLOCKED
    //WAITING
    //TIMED_WAITING
    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            System.out.println("main中状态"+t.getState());
            t.start();
            Thread.sleep(500);
            System.out.println("main中状态"+t.getState());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
