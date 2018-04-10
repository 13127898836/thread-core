package com.thread.lesson3.c_3_1.c_3_1_3;

/**
 * 出现异常的原因是没有 对象监视器java.lang.IllegalMonitorStateException
 * Created by cch
 * 2018-04-10 10:47.
 */

public class Test1 {
    public static void main(String[] args) {
        try{
            String newString = new String("");
            newString.wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
