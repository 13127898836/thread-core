package com.thread.lesson3.c_3_1.c_3_1_11_4;

import java.util.ArrayList;
import java.util.List;

/**
 * 一生产者与一消费者：操作栈
 * 通过生产者/消费者模式，容器size（）的值不会大于1，这也是本利想要实现的效果
 * 把判断条件的if 换成while  notify 换成notifyAll 就能支持 多生产者 多消费者
 * Created by cch
 * 2018-04-11 13:55.
 */

public class MyStack {
    private List list = new ArrayList();
    synchronized public void push(){
        try{
            if(list.size()==1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            this.notify();
            System.out.println("push="+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue="";
        try{
            if(list.size()==0){
                System.out.println("pop操作:"+Thread.currentThread().getName()+" 线程wait");
                this.wait();
            }
            returnValue = ""+list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop="+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
