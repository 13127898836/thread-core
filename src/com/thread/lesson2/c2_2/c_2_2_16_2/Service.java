package com.thread.lesson2.c2_2.c_2_2_16_2;

/**
 * Created by cch
 * 2018-04-09 13:27.
 */

public class Service {
    public  void serviceMethod(Userinfo userinfo){
        synchronized (userinfo){
            try{
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                userinfo.setUsername("abc");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }catch (Exception e){

            }
        }
    }
}
