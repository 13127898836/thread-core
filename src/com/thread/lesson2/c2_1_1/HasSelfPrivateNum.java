package com.thread.lesson2.c2_1_1;

/**
 * Created by chenchenghao on 2018/1/3.
 */
public class HasSelfPrivateNum {
    public void addI(String username){
        try{
            int num =0;
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
            }else{
                num=20;
                System.out.println("b set over");
            }
            System.out.println(username+" num="+num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
