package com.demo.synchronize.producerconsumer;

public class Producer extends Thread {

    private Counter counter  = null;

    private String[] colors = {"white", "red", "green", "black"};

    public Producer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        int num = 0;
        while (true) {
            Icecream icecream = new Icecream("ic-" + num, colors[num % colors.length]);
            counter.add(icecream);
            num++;
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
