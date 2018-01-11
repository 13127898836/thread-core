package com.thread.lesson2.c2_1.c2_1_8;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 9:34.
 */

public class Main {
    synchronized public void serviceMethod(){
        try{
            System.out.println("int main next sleep begin threadName="+Thread.currentThread().getName()+
            " time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main next sleep end threadName="+Thread.currentThread().getName()+
                    " time="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
