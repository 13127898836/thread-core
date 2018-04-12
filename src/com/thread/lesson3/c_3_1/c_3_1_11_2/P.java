package com.thread.lesson3.c_3_1.c_3_1_11_2;

/**
 * Created by cch
 * 2018-04-11 12:50.
 */

public class P {
    private String lock;

    public P(String lock) {
        this.lock = lock;
    }
    public void setValue(){
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + " WATING");
                    lock.wait();
                }
                System.out.println("生产者"+Thread.currentThread().getName()+"RUNNING");
                String value = System.currentTimeMillis()+"_"+System.nanoTime();
                ValueObject.value =value;
                lock.notifyAll();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
