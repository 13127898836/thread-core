package com.thread.lesson2.c2_1.c2_1_2;
/**
 * Created by chenchenghao on 2018/1/3.
 */
public class HasSelfPrivateNum {
    private int num =0;//in multithreding maybe dirty read add synchronize will fix the problem

    synchronized  public void addI(String username){
        try{
            if(username.equals("a")){
                num=100;
                System.out.println("a set over");
                Thread.sleep(1500);
            }else{
                num=200;
                System.out.println("b set over");
            }
            System.out.println(username+" num="+num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
