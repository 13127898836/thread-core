package com.thread.lesson2.c2_1.c2_1_3;
/**
 * Created by chenchenghao on 2018/1/4.
 */
public class ThreadB extends Thread{
    private HasSelfPrivateNum numRef;
    public ThreadB(HasSelfPrivateNum numRef){
        super();
        this.numRef= numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
