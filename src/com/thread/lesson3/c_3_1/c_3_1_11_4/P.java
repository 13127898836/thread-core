package com.thread.lesson3.c_3_1.c_3_1_11_4;

/**
 * Created by cch
 * 2018-04-11 14:01.
 */

public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
