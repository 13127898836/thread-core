package com.thread.lesson3.c_3_2.c_3_2_4;

/**
 * Created by cch
 * 2018-04-13 13:12.
 */

public class Test {
    public static void main(String[] args) {
        try{
        MyThread threadTest = new MyThread();
        threadTest.start();
        //threadTest.join(2000);
            Thread.sleep(2000);
            System.out.println(" end  timer="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
