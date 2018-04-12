package com.thread.lesson3.c_3_1.c_3_1_11_2;

/**
 * Created by cch
 * 2018-04-11 12:51.
 */

public class C {
    private String lock;

    public C(String lock) {
        this.lock = lock;
    }
    public void getValue(){
        try{
            synchronized (lock){
                while(ValueObject.value.equals("")){
                    System.out.println("消费者"+Thread.currentThread().getName()+" WAITING");
                    lock.wait();
                }
                System.out.println("消费者"+Thread.currentThread().getName()+" RUNNING");
                ValueObject.value="";
                lock.notifyAll();

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
