package com.thread.lesson2.c2_1.c2_1_6;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:37.
 */

public class Sub extends Main {
    synchronized public void operateMainMethod(){
        try{
            while(i>0){
                i--;
                System.out.println("sub print i="+i);
                Thread.sleep(100);
                this.operateMainMethod();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
