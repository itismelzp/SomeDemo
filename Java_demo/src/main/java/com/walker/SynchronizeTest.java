package com.walker;

public class SynchronizeTest {

//    public synchronized void method1() {
//
//        System.out.println("method 1 start...");
//
//        try {
//            System.out.println("method 1 execute...");
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("method 1 end.");
//    }
//
//    public synchronized void method2() {
//
//        System.out.println("method 2 start...");
//
//        try {
//            System.out.println("method 2 execute ...");
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("method 2 end.");
//    }

    public static synchronized void smethod1() {

        System.out.println("smethod 1 start...");

        try {
            System.out.println("smethod 1 execute...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("smethod 1 end.");
    }

    public static synchronized void smethod2() {

        System.out.println("smethod 2 start...");

        try {
            System.out.println("smethod 2 execute...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("smethod 2 end.");
    }

    public static void main(String[] args) {

//        SynchronizeTest test = new SynchronizeTest();
//        new Thread(test::method1).start();
//        new Thread(test::method2).start();

        SynchronizeTest stest1 = new SynchronizeTest();
        SynchronizeTest stest2 = new SynchronizeTest();

        new Thread(() -> stest1.smethod1()).start();

        new Thread(SynchronizeTest::smethod2).start();

    }

}
