package com.thread.lesson3.c_3_1.c_3_1_11;

/**
 * Created by cch
 * 2018-04-11 11:42.
 */

public class C {
private String lock;

    public C(String lock) {
        this.lock = lock;
    }
    public void getVlaue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值"+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
