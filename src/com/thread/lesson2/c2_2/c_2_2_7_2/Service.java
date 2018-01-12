package com.thread.lesson2.c2_2.c_2_2_7_2;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:42.
 */

public class Service {
    private String anyString = new String();
    public void a(){
        try{
            synchronized (anyString){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
