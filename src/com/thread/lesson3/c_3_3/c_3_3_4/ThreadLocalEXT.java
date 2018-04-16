package com.thread.lesson3.c_3_3.c_3_3_4;

import java.util.Date;

/**
 * Created by cch
 * 2018-04-13 15:25.
 */

public class ThreadLocalEXT extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
