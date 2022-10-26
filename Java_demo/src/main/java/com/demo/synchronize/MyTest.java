package com.demo.synchronize;



import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * wait(), notify(), notifyAll()小结
 * （1）必须在synchronized块或方法里面使用
 * （2）注意，需用锁对象来调用
 * （3）底层使用Monitor机制，wait()过后进入Monitor对象的WaitSet
 * （4）调用wait()后，就会释放锁
 * （5）调用notify(), notifyAll()后，不会立即释放琐
 */
public class MyTest {


    private int num = 0;

    public static void main(String[] args) {
        MyTest test = new MyTest();

//        new Thread(test::m1).start();
//        new Thread(test::m2).start();


        new Thread(test::setNum).start();
        new Thread(test::setNum).start();
        new Thread(test::setNum).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(test.getNum());
            }
        }).start();

        int a = 2147483644;
        int b = 2147483644;
        int c = a + b;
        System.out.println("c: " + c);

        test.<Integer>a(123);

        try {
            Class unsafeClass = Class.forName("sun.misc.Unsafe");
            Field theUnsafe = unsafeClass.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Method method = unsafeClass.getDeclaredMethod("pageSize");
            method.setAccessible(true);
            System.out.println("pageSize: " + method.invoke(theUnsafe.get(null)));
        } catch (ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

//        Unsafe unsafe  = Unsafe.getUnsafe();
//        System.out.println("pageSize: " + unsafe.pageSize());

    }

    private <T> void a(T a) {
        System.out.println("a1: " + a);
    }
    private void a(String a) {
        System.out.println("a2: " + a);
    }

    private synchronized void setNum() {
        try {
            num++;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread() + " setNum.");
        if (num == 3) {
            System.out.println(Thread.currentThread() + " notify.");
            notify();
        }

    }

    private synchronized int getNum() {
        System.out.println(Thread.currentThread() + " getNum.");
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (num < 3) {
            try {
                System.out.println(Thread.currentThread() + " wait.");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return num;
    }

    private void m1() {
        synchronized (this) {
            System.out.println("m1: " + Thread.currentThread());
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Integer.valueOf(num)) {
                System.out.println("m1: some work " + Thread.currentThread());
            }
            notify();
        }
    }

    private void m2() {
        synchronized (Integer.valueOf(num)) {
            System.out.println("m2: " + Thread.currentThread());
            synchronized (this) {
                System.out.println("m2: some work " + Thread.currentThread());
            }
        }
    }

}
