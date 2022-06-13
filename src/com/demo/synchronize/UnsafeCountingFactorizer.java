package com.demo.synchronize;

public class UnsafeCountingFactorizer {


    private long count = 0;

    public void service() {
        ++count;
    }

    public long getCount() {
        return count;
    }
}
