package com.thread.lesson3.c_3_1.c_3_1_14;

/**
 * Created by cch
 * 2018-04-12 13:17.
 */

public class DBTools {
    volatile private boolean prevIsA = false;
    synchronized public void backupA(){
        try{
            while(prevIsA==true){
                wait();
            }
            for(int i=0;i<5;i++){
                System.out.println("sssss");
            }
            prevIsA = true;
            notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try{
            while(prevIsA == false){
                wait();
            }
            for(int i=0;i<5;i++){
                System.out.println("fffff");
            }
            prevIsA=false;
            notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
