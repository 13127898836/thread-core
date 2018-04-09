package com.thread.lesson3.c_3_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cch
 * 2018-04-09 19:33.
 */

public class MyList {
    private List list = new ArrayList();
    public void add(){
        list.add("cch");
    }

    public int size(){
        return list.size();
    }
}
