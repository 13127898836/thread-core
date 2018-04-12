package com.thread.lesson3.c_3_1.c_3_1_14;

/**
 * 实战:等待/通知 交叉备份
 * Created by cch
 * 2018-04-12 13:24.
 */

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i =0;i<20;i++){
          BackupB output = new BackupB(dbTools);
          output.start();
          BackupA input = new BackupA(dbTools);
          input.start();
        }
    }
}
