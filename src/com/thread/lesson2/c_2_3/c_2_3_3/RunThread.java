package com.thread.lesson2.c_2_3.c_2_3_3;

/**
 * Created by cch
 * 2018-04-09 14:08.
 */

public class RunThread extends Thread{
    private boolean isRuning = true;

    public boolean isRuning() {
        return isRuning;
    }

    public void setRuning(boolean runing) {
        isRuning = runing;
    }

    public void run(){
        try {
            System.out.println("进入run");
            while (isRuning) {
                /*System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);*/
            }
            System.out.println("线程被停止了");
        }catch (Exception e){

        }
        }

}
