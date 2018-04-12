package com.thread.lesson3.c_3_1.c_3_1_9;

/**
 * 可以避免无效的等待
 * Created by cch
 * 2018-04-11 11:08.
 */

public class MyRun2 {
    private String lock = new String("");
    private boolean isFirstRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock){
                    while(!isFirstRunB){
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFirstRunB= true;
            }
        }
    };

    public static void main(String[] args) {
        MyRun2 run = new MyRun2();
        Thread a = new Thread(run.runnableA);
        a.start();
        Thread b = new Thread(run.runnableB);
        b.start();

    }

}
