package com.thread.lesson3.c_3_3.c_3_3_3;

/**
 * Created by cch
 * 2018-04-13 15:25.
 */

public class ThreadLocalEXT extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return "这是我的默认值";
    }
}
