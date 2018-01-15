package com.thread.lesson2.c2_2.c_2_2_8_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 18:19.
 */

public class MyObject {
     public void speedPrintString(){
        synchronized (this) {
            System.out.println("speedPrintString____getLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
            System.out.println("----------------------------------");
            System.out.println("speedPrintString_____releaseLock time="
                    + System.currentTimeMillis() + " run ThreadName="
                    + Thread.currentThread().getName());
        }
    }
}
