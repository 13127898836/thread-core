package com.thread.lesson3.c_3_1.c_3_1_1;

/**
 * Created by cch
 * 2018-04-10 10:08.
 */

public class ThreadB extends Thread{
    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("b start");
        try{
            while (true){
                if(list.size()>=5){
                    System.out.println(">=5了,线程b要退出了");
                    throw  new InterruptedException();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
