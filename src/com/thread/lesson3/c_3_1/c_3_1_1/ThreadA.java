package com.thread.lesson3.c_3_1.c_3_1_1;

/**
 * Created by cch
 * 2018-04-10 10:06.
 */

public class ThreadA extends Thread{
    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {

        try{
            for(int i=0;i<10;i++){
                list.add();
                System.out.println("增加了 "+(i+1)+"个元素");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
