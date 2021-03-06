package com.walker.designmode.observer;

public class User implements Observer {

    private String name;
    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息：" + msg);
    }
}
