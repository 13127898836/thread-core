package com.thread.lesson2.c2_1.c2_1_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-08 20:55.
 */

/**
 * 线程a出现异常并释放锁，线程进入放大正常打印，实验结论就是出现异常的锁被自动释放了。
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        this.service = service;
    }
    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
