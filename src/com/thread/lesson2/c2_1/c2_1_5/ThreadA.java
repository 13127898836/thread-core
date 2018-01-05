package com.thread.lesson2.c2_1.c2_1_5;

/**
 * Created by 459105408@qq.com
 * 2018-01-04 15:16.
 */

public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
