package com.thread.lesson7.c_7_4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cch
 * 2018-05-03 13:02.
 */

public class MyThread  extends Thread{
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try{
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef).toString();
            if(!newDateString.equals(dateString)){
                System.out.println("ThreadName="+this.getName()
                +" 报错了 日期字符串："+dateString+" 转换后："+newDateString);
            }
        }catch (Exception e){
            System.out.println("异常");
            e.printStackTrace();
        }
    }
}
