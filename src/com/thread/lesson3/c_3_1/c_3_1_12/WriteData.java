package com.thread.lesson3.c_3_1.c_3_1_12;

import java.io.PipedOutputStream;

/**
 * Created by cch
 * 2018-04-11 14:20.
 */

public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try{
            System.out.println("wirte:");
            for(int i=0;i<30;i++){
                String outData = ""+(i+1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
