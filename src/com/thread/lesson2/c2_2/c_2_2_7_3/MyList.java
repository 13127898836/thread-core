package com.thread.lesson2.c2_2.c_2_2_7_3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 15:46.
 */

public class MyList {
    private List list = new ArrayList();
    synchronized public void add(String username){
        System.out.println("ThreadName="+Thread.currentThread().getName()+"执行了add方法!");
        list.add(username);
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了add方法!");
    }
    synchronized public int getSize(){
        System.out.println("ThreadName="+Thread.currentThread()+"执行了getSize方法!");
        int sizeValue = list.size();
        System.out.println("ThreadName="+Thread.currentThread().getName()+"退出了getSize方法!");
        return sizeValue;
    }

}
