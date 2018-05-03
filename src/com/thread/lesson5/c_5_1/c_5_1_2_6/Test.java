package com.thread.lesson5.c_5_1.c_5_1_2_6;



import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by cch
 * 2018-04-23 21:22.
 */

public class Test {
    public static void main(String[] args) {
        int i =0;
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        while (true){
            i++;
            MyTaskA taskA = new MyTaskA(i);
            Timer timer = new Timer();
            timer.schedule(taskA,date);
            timer.cancel();
        }
    }
}
