package com.thread.lesson2.c2_2.c_2_2_13;

/**
 * Created by 459105408@qq.com
 * 2018-01-20 18:46.
 */

/**
 * 内部类的使用
 */
public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("userNameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " "+publicClass.getPassword());
        PublicClass.PrivateClass privateClass= new PublicClass.PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
    }
}
