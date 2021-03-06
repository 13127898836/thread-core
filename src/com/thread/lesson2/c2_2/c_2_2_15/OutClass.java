package com.thread.lesson2.c2_2.c_2_2_15;

/**
 * Created by 459105408@qq.com
 * 2018-01-21 23:02.
 */

public class OutClass {
    static class InnerClass1{
        public void method1(InnerClass2 class2){
            String threadName = Thread.currentThread().getName();
            synchronized (class2){
                System.out.println(threadName+" 进入InnerClass1类中的method1方法");
                for(int i =0;i<10;i++){
                    System.out.println("i="+i);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){

                    }

                }
                System.out.println(threadName+" 离开InnerClass1类中的method1方法");
            }
        }

        public synchronized  void method2(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" 进入InnerClass1类中的method2方法");
            for(int i =0;i<10;i++){
                System.out.println("i="+i);
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
            }
            System.out.println(threadName+" 离开InnerClass1类中的method2方法");
        }
    }

    static class InnerClass2{
        public synchronized  void method1(){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" 进入InnerClass2类中的method1方法");
            for(int i =0;i<10;i++){
                System.out.println("i="+i);
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
            }
            System.out.println(threadName+" 离开InnerClass2类中的method1方法");
        }
    }
}
