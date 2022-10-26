package com.demo.synchronize.producerconsumer;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();

        new Producer(counter).start();
        new Producer(counter).start();
        new Producer(counter).start();
        new Producer(counter).start();

        new Consumer(counter).start();
        new Consumer(counter).start();
        new Consumer(counter).start();
        new Consumer(counter).start();
        new Consumer(counter).start();

    }

}
