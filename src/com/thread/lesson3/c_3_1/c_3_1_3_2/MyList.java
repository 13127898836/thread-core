package com.thread.lesson3.c_3_1.c_3_1_3_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cch
 * 2018-04-10 11:07.
 */

public class MyList {
    private static List list = new ArrayList();

    public static void add(){
        list.add("cch");
    }

    public static int size(){
        return list.size();
    }
}
