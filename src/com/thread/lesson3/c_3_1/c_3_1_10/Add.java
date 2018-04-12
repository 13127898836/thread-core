package com.thread.lesson3.c_3_1.c_3_1_10;



/**
 * Created by cch
 * 2018-04-11 11:14.
 */

public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
