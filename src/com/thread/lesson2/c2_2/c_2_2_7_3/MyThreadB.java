package com.thread.lesson2.c2_2.c_2_2_7_3;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:37.
 */

public class MyThreadB extends Thread{
    private MyList list;

    public MyThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for(int i =0;i<10000;i++){
            list.add("threadB"+(i+1));
        }
    }
}
