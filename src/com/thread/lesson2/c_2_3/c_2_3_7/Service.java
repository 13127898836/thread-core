package com.thread.lesson2.c_2_3.c_2_3_7;

/**
 * while()方法体内用synchronized 可解决可见性问题
 * Created by cch
 * 2018-04-09 17:41.
 */

public class Service {
    private boolean isContinueRun = true;
    public void runMethod(){
        String anyString = new String();
        int count =0;
        while(isContinueRun){
            //count++;
            System.out.print("run");
            System.out.println("---");
            /*synchronized (anyString){

            }*/
        }
        System.out.println("停下来了！");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}
