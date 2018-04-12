package com.thread.lesson3.c_3_1.c_3_1_14;

/**
 * Created by cch
 * 2018-04-12 13:24.
 */

public class BackupB extends Thread {
    private DBTools dbTools;

    public BackupB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
