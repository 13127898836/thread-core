package com.thread.lesson3.c_3_1.c_3_1_3_2;

/**
 * Created by cch
 * 2018-04-10 11:09.
 */

public class ThreadA extends Thread{
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try{
           synchronized (lock){
               if(MyList.size()!=5){
                   System.out.println("wait begin"+System.currentTimeMillis());
                   lock.wait();
                   System.out.println("wait end"+System.currentTimeMillis());
               }
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
