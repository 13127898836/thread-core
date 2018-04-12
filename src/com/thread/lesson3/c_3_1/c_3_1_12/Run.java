package com.thread.lesson3.c_3_1.c_3_1_12;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *通过管道进行线程间通信：字节流 PipedInputStream PipedOutputStream
 *                      字符流  PipedWriter  PipedReader
 * Created by cch
 * 2018-04-11 14:27.
 */

public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData,inputStream);
            threadRead.start();
            Thread.sleep(5000);
            ThreadWirte threadWirte = new ThreadWirte(writeData,outputStream);
            threadWirte.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
