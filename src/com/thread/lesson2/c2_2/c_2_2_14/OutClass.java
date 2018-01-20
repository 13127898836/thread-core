package com.thread.lesson2.c2_2.c_2_2_14;

/**
 * Created by 459105408@qq.com
 * 2018-01-20 22:33.
 */

public class OutClass {
    static class Inner{
        public void method1(){
            synchronized ("其他的锁"){
                for(int i=1;i<=10;i++){
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                    }
                }
            }
        }

        public synchronized void method2(){
            for(int i=1;i<=20;i++){
                System.out.println(Thread.currentThread().getName()+" i="+i);
                try{
                 Thread.sleep(100);
                }catch (Exception e){
                }
            }
        }
    }
}
