package com.thread.lesson2.c2_2.c_2_2_7_4;

import com.thread.lesson2.c2_1.c2_1_6.MyThread;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:58.
 */

/**
 * 根据结果，出现脏读，原因是两个线程以异步的方式返回list参数的size（）大小，解决办法是"同步化"
 * 在myServic的判断条件外面加synchronized方法块
 */
public class Run {
    public static void main(String[] args)throws Exception {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("listSize=" + list.getSize());
    }
}
