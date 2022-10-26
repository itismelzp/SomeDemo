package com.walker.designmode;

import com.walker.designmode.builder.Product2;
import com.walker.designmode.observer.Observer;
import com.walker.designmode.observer.User;
import com.walker.designmode.observer.WechatServer;

public class Test {

    public static void main(String[] args) {


        // 观察者模式

        System.out.println("\n观察者模式");

        WechatServer server = new WechatServer();

        Observer o1 = new User("zhansan");
        Observer o2 = new User("lisi");
        Observer o3 = new User("wangwu");

        server.registerObserver(o1);
        server.registerObserver(o2);
        server.registerObserver(o3);

        server.setMsg("hi, everyone..");

        server.unRegisterObserver(o1);

        server.setMsg("hi, some one..");
        // ----

        // Build模式

        System.out.println("\nBuild模式");
        Product2.Builder builder = new Product2.Builder();
        Product2 product2 = builder
                .setPartA("part a")
                .setPartB("part b")
                .setPartC("part c")
                .build();
        System.out.println(product2);



        Test test = new Test();
        InnerClass innerClass = test.new InnerClass();
        innerClass.print();


    }

    class InnerClass {
        private void print() {
            System.out.println("InnerClass...");
        }
    }

    static class StaticInnerClass {
    }

}
