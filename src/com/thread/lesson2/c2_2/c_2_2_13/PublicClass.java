package com.thread.lesson2.c2_2.c_2_2_13;

/**
 * Created by 459105408@qq.com
 * 2018-01-20 18:43.
 */

public class PublicClass {
    private static String username;
    private static  String password;
    static class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public void printPublicProperty(){
            System.out.println(username +" "+password);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
