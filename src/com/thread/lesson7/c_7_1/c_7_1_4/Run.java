package com.thread.lesson7.c_7_1.c_7_1_4;

/**
 * 验证WAITING
 * Created by cch
 * 2018-04-24 12:59.
 */

public class Run {
    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main中t的状态"+t.getState());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
