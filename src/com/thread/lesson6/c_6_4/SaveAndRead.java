package com.thread.lesson6.c_6_4;

import java.io.*;

/**
 * readResolve() 不覆盖，返回的结果不是单例的
 * Created by cch
 * 2018-04-24 11:14.
 */

public class SaveAndRead {
    public static void main(String[] args) throws Exception {
        MyObject myObject = MyObject.getInstance();
        FileOutputStream fosRef = new FileOutputStream(new File("myObjectFile.txt"));
        ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
        oosRef.writeObject(myObject);
        oosRef.close();
        fosRef.close();
        System.out.println(myObject);

        FileInputStream fisRef = new FileInputStream(new File("myObjectFile.txt"));
        ObjectInputStream iosRef = new ObjectInputStream(fisRef);
        MyObject object = (MyObject) iosRef.readObject();
        iosRef.close();
        fisRef.close();
        System.out.println(object);
    }
}
