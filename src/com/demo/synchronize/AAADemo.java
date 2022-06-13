package com.demo.synchronize;

public class AAADemo {

    public static void main(String[] args) {

//        testUnsafeCountingFactorizer();
        testCountingFactorizer();
//        testUnsafeCachingFactorizer();
//        testSynchronizerFactorizer();
    }

    private static final int CNT = 1000;
    private static void testUnsafeCountingFactorizer() {
        UnsafeCountingFactorizer factorizer = new UnsafeCountingFactorizer();
        new Thread(() -> {
            for (int i = 0; i < CNT; i++) {
                factorizer.service();
            }
            System.out.println("testUnsafeCountingFactorizer1: " + factorizer.getCount());
        }).start();

        new Thread(() -> {
            for (int i = 0; i < CNT; i++) {
                factorizer.service();
            }
            System.out.println("testUnsafeCountingFactorizer2: " + factorizer.getCount());
        }).start();
    }

    private static void testCountingFactorizer() {
        CountingFactorizer countingFactorizer1 = new CountingFactorizer();
        for (int i = 0; i < CNT; i++) {

            new Thread(() -> {
                countingFactorizer1.service();
                System.out.println("testCountingFactorizer1: " + countingFactorizer1.getCount());
            }).start();
        }

        for (int i = 0; i < CNT; i++) {
            new Thread(() -> {
                countingFactorizer1.service();
                System.out.println("testCountingFactorizer2: " + countingFactorizer1.getCount());
            }).start();
        }

    }

    private static void testUnsafeCachingFactorizer() {
        UnsafeCachingFactorizer factorizer = new UnsafeCachingFactorizer();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                factorizer.service("123");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                factorizer.service("456");
            }
        }).start();
    }

    private static void testSynchronizerFactorizer() {
        SynchronizerFactorizer factorizer = new SynchronizerFactorizer();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                factorizer.service("123");
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                factorizer.service("456");
            }
        }).start();
    }

}
