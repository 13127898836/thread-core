package com.thread.lesson7.c_7_2.c_7_2_7;

import com.thread.lesson3.c_3_1.c_3_1_10.ThreadAdd;

/**
 * 递归和非递归 取得组内对象
 * Created by cch
 * 2018-05-03 12:36.
 */

public class Run {
    public static void main(String[] args) {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup,"A");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("runMethod");
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        ThreadGroup groupB = new ThreadGroup(groupA,"B");

        ThreadGroup[] listGroup1 = new ThreadGroup[ThreadAdd.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup1,true);

        for(int i=0;i<listGroup1.length;i++){
            if(listGroup1[i]!=null){
                System.out.println(listGroup1[i].getName());
            }
        }

        ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup2,false);
        for(int i=0;i<listGroup2.length;i++){
            if(listGroup2[i] !=null){
                System.out.println(listGroup2[i].getName());
            }
        }



    }
}
