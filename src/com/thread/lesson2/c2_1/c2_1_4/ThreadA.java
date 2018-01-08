package com.thread.lesson2.c2_1.c2_1_4;
/**
 * @author 459105408@qq.com
 * @create 2018-01-04 9:59
 */
public class ThreadA extends Thread{
    private MyObject object;
    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
