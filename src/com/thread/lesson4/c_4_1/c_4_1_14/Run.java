package com.thread.lesson4.c_4_1.c_4_1_14;

/**
 * await()换成
 * awaitUninterruptibly() 在被线程打断的时候 不会出现异常
 * Created by cch
 * 2018-04-19 14:18.
 */

public class Run {
    public static void main(String[] args) {
        try{
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
