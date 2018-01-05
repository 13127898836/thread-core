package com.thread.lesson2.c2_1.c2_1_5;

/**
 * Created by 459105408@qq.com
 * 2018-01-04 15:18.
 */

/**
 * 如果getValue不是同步的，那么可以在任意时刻调用，会出现脏读。
 * 解决方法 加上synchronized
 * 脏读一定会出现在操作实例变量的情况下，这就是不同线程“争抢”实例变量的结果
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA threadA = new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
