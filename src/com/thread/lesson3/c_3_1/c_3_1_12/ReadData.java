package com.thread.lesson3.c_3_1.c_3_1_12;

import java.io.PipedInputStream;

/**
 * Created by cch
 * 2018-04-11 14:23.
 */

public class ReadData {
    public void readMethod(PipedInputStream input){
        try{
            System.out.println("read :");
            byte[] byteArray= new byte[20];
            int readLength = input.read(byteArray);//堵塞 等读到数据
            while(readLength!=-1){
                String newData = new String (byteArray,0,readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
