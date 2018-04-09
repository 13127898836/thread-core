package com.thread.lesson2.c_2_3.c_2_3_1;

/**
 * Created by cch
 * 2018-04-09 13:38.
 */

public class PrintString {
    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }
    public void printStringMethod(){
        try{
           while(isContinuePrint){
               System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
               Thread.sleep(1000);
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
