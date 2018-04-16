package com.thread.lesson3.c_3_3.c_3_3_2;

/**
 * 虽然三个线程都往t1放入数据，但是每个线程还啥都取出来了
 * Created by cch
 * 2018-04-13 15:08.
 */

public class Run {
    public static void main(String[] args) {
        try{
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for(int i =0;i<100;i++){
                Tools.t1.set("main"+(i+1));
                System.out.println("Main get value="+Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
