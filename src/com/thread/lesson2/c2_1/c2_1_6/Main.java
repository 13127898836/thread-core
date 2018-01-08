package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:33.
 */

public class Main {
    public int i =10;
    synchronized public void operateMainMethod(){
        try{
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
