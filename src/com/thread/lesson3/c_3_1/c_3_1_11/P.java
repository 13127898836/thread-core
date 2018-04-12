package com.thread.lesson3.c_3_1.c_3_1_11;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by cch
 * 2018-04-11 11:41.
 */

public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }
    public void setValue(){
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                System.out.println("set的值是"+value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
