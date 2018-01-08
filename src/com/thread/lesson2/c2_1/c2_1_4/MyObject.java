package com.thread.lesson2.c2_1.c2_1_4;
/**
 * @author 459105408@qq.com
 * @create 2018-01-04 9:49
 */
public class MyObject {
    //如果不是 共享资源 不要加上synchronized

    /**
     * 结论：
     * A线程先持有object对象的Lock锁，B对象可以以异步的方式访问object对象中非synchronized类型的方法
     * A线程先持有object对象的Lock锁，B对象调用synchronized的方法需要等待，也就是同步
     */
    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName=" +
                    Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void methodB(){
        try {
            System.out.println("begin methodB threadName=" +
                    Thread.currentThread().getName()+" beginTime="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
