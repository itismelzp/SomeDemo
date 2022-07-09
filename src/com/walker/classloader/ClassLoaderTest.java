package com.walker.classloader;

import java.io.File;

public class ClassLoaderTest {

    public static void main(String[] args) {

        DiskClassLoader diskClassLoader = new DiskClassLoader("./lib");

        File file = new File("..\\lib");
        file.listFiles();
        System.out.println(file);

        ClassLoaderTest test = new ClassLoaderTest();
        System.out.println(test.getClass().getClassLoader());


        Class<?> x;
        try {
            x = Class.forName("[I");
            Object o = x.newInstance();
//            System.out.println(x);
            System.out.println(int.class);
        } catch (Exception e) {
            e.printStackTrace();
        }


        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        InheritableThreadLocal<Integer> integerInheritableThreadLocal = new InheritableThreadLocal<>();
        threadLocal.set(000);
        integerInheritableThreadLocal.set(000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + ": " + threadLocal.get());
                System.out.println(Thread.currentThread() + ": " + integerInheritableThreadLocal.get());
                threadLocal.set(111);
                for (;;) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread() + ": " + threadLocal.get());
                }

            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadLocal.set(222);
        integerInheritableThreadLocal.set(222);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + ": " + threadLocal.get());

            }
        }).start();

    }
}
