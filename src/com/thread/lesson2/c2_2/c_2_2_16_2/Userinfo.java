package com.thread.lesson2.c2_2.c_2_2_16_2;

/**
 * Created by cch
 * 2018-04-09 13:26.
 */

public class Userinfo {
    private String username;
    private String password;

    public Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
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
