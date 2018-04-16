package com.thread.lesson3.c_3_2.c_3_2_5;

/**
 * Created by cch
 * 2018-04-13 13:16.
 */

public class ThreadA extends  Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                b.start();
                //Thread.sleep(6000);
                b.join();
                for(int i =0;i<Integer.MAX_VALUE;i++){
                    String newString = new String();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
