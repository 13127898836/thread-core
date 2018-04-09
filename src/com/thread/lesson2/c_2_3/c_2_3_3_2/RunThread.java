package com.thread.lesson2.c_2_3.c_2_3_3_2;

/**
 * Created by cch
 * 2018-04-09 16:00.
 */

public class RunThread extends Thread{
    volatile  private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run");
        while(isRunning){
            System.out.println("run-----------");
        }
        System.out.println("线程被停止了");
    }
}
