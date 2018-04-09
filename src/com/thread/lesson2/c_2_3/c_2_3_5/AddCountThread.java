package com.thread.lesson2.c_2_3.c_2_3_5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by cch
 * 2018-04-09 17:05.
 */

public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(count.incrementAndGet());
        }
    }
}
