package com.thread.lesson3.c_3_3.c_3_3_2_2;


import java.util.Date;

/**
 * Created by cch
 * 2018-04-13 15:16.
 */

public class ThreadA extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<20;i++){
                if(Tools.t1.get()==null){
                    Tools.t1.set(new Date());
                }
                System.out.println("A "+Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
