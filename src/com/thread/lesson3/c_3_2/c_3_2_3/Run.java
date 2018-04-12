package com.thread.lesson3.c_3_2.c_3_2_3;

/**
 * 根据 运行结果 说明
 * join 与 interrupt 彼此相遇，会出现异常。
 * 但是ThreadA 并没出现异常
 * Created by cch
 * 2018-04-12 13:56.
 */

public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
