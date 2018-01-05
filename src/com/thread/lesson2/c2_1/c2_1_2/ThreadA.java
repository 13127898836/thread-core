package com.thread.lesson2.c2_1.c2_1_2;
/**
 * Created by chenchenghao on 2018/1/3.
 */
public class ThreadA extends  Thread {
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef){
        super();
        this.numRef= numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}
