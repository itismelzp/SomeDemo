package com.demo.synchronize;

public class ThreadUtil {

    public static String getThreadName() {
        return "[" + Thread.currentThread().getName() + "]";
    }
}
