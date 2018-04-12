package com.thread.lesson3.c_3_1.c_3_1_11_4;

/**
 * Created by cch
 * 2018-04-11 14:02.
 */

public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
