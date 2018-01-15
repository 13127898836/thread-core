package com.thread.lesson2.c2_2.c_2_2_7_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 459105408@qq.com
 * 2018-01-15 16:50.
 */

public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
