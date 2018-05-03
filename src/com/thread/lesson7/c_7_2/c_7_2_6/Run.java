package com.thread.lesson7.c_7_2.c_7_2_6;

/**
 * 组内线程批量停止
 * Created by cch
 * 2018-05-02 13:08.
 */

public class Run {

    public static void main(String[] args) {
        try{
            ThreadGroup group = new ThreadGroup("我的线程组");
            for(int i=0;i<5;i++){
                MyThread thread = new MyThread(group,"线程"+i);
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("interrput");
        }catch (Exception e){
            System.out.println("stop stop");
            e.printStackTrace();
        }

    }
}
