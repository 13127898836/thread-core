package com.thread.lesson2.c2_1.c2_1_8;

/**
 * Created by 459105408@qq.com
 * 2018-01-09 9:37.
 */

/**
 * 同步是不能继承的，父类的方法是同步的，子类覆盖的方法不是同步的，需要自己加上
 */
public class Sub extends Main{
    @Override
    synchronized public void serviceMethod() {
        try{
            System.out.println("int sub next sleep begin threadName="+Thread.currentThread().getName()+
                    " time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub next sleep end threadName="+Thread.currentThread().getName()+
                    " time="+System.currentTimeMillis());
            super.serviceMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
