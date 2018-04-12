package com.thread.lesson3.c_3_1.c_3_1_12;

import java.io.PipedInputStream;

/**
 * Created by cch
 * 2018-04-11 14:26.
 */

public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
