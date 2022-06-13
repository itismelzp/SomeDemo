package com.demo.synchronize;


import java.util.concurrent.atomic.AtomicLong;

public class CountingFactorizer {

    private final AtomicLong count = new AtomicLong(0);

    public void service() {
        count.incrementAndGet();
    }

    public long getCount() {
        return count.get();
    }
}
