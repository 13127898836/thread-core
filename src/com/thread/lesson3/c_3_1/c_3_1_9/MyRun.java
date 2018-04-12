package com.thread.lesson3.c_3_1.c_3_1_9;

/**
 * 通知早了 wait只能一直等了
 * Created by cch
 * 2018-04-11 11:00.
 */

public class MyRun {
    private String lock = new String("");
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try{
                synchronized (lock) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
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
            }
        }
    };

    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread b = new Thread(run.runnableB);
        b.start();

        Thread a = new Thread(run.runnableA);
        a.start();

    }
}
