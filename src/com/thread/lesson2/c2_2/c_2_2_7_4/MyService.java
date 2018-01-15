package com.thread.lesson2.c2_2.c_2_2_7_4;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:52.
 */

public class MyService{
    public MyOneList addServiceMethod(MyOneList list,String data){
        try{
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;

    }
}
