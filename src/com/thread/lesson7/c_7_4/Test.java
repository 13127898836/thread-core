package com.thread.lesson7.c_7_4;

import java.text.SimpleDateFormat;

/**
 * SimpleDateFormat 在多线程环境会报错 或 出现转换错误
 * Created by cch
 * 2018-05-03 13:05.
 */

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[]{"2010-01-01","2012-02-02","2013-03-03","2014-04-04","2015-05-05"};
        MyThread[] threadArray = new MyThread[5];
        for(int i=0;i<5;i++){
            threadArray[i] = new MyThread(sdf,dateStringArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            threadArray[i].start();
        }
    }
}
