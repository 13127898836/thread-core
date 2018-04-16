package com.thread.lesson3.c_3_4.c_3_4_2;

import java.util.Date;

/**
 * Created by cch
 * 2018-04-13 15:36.
 */

public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"我在子线程中加的";
    }
}
