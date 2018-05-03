package com.thread.lesson7.c_7_1.c_7_1_2;

/**
 * 验证 TIMED_WAITING
 * Created by cch
 * 2018-04-24 12:32.
 */

public class Run {
    public static void main(String[] args) {
        try{
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main中的状态:"+t.getState());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
