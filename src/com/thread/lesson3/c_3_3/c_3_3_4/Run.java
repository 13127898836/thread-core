package com.thread.lesson3.c_3_3.c_3_3_4;

/**
 * Created by cch
 * 2018-04-13 15:31.
 */

public class Run {
    public static void main(String[] args) {
        try {
            for(int i =0;i<10;i++){
                System.out.println("在main取值"+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
