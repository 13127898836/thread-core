package com.thread.lesson3.c_3_3.c_3_3_2_2;



/**
 * 验证线程变量的隔离线
 * Created by cch
 * 2018-04-13 15:19.
 */

public class Run {
    public static void main(String[] args) {
        try{
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
