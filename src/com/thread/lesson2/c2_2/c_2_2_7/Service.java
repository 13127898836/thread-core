package com.thread.lesson2.c2_2.c_2_2_7;

/**
 * Created by 459105408@qq.com
 * 2018-01-12 13:18.
 */

public class Service {
    private String usernameParam;
    private String passwordParam;
    //private String anyString = new String();

    public void setUsernameParam(String username,String password){
        try{
            String anyString = new String();
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()+
                        " 在"+System.currentTimeMillis()+"进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为："+Thread.currentThread().getName()+
                "在"+System.currentTimeMillis()+"离开同步块");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
