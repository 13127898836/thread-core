package com.thread.lesson3.c_3_1.c_3_1_10;

/**
 * Created by cch
 * 2018-04-11 11:15.
 */

public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }
    public void subtract(){
        try{
            synchronized (lock){

                while(ValueObject.list.size()==0){
                    System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName="+Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println(Thread.currentThread().getName()+" list size="+ValueObject.list.size());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
