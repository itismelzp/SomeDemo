package com.demo.synchronize.producerconsumer;

public class Consumer extends Thread {

    private Counter counter = null;

    public Consumer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        while (true) {
            counter.take();
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
