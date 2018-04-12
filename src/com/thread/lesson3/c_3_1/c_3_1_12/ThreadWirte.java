package com.thread.lesson3.c_3_1.c_3_1_12;

import java.io.PipedOutputStream;

/**
 * Created by cch
 * 2018-04-11 14:25.
 */

public class ThreadWirte extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWirte(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
