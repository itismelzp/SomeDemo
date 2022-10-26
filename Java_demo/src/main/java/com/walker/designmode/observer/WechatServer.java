package com.walker.designmode.observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {


    private List<Observer> list;
    private String msg;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void unRegisterObserver(Observer o) {
        if (list.isEmpty()) {
            return;
        }
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }


    public void setMsg(String msg) {
        this.msg = msg;
        System.out.println("[setMsg] msg: " + msg);
        notifyObserver();
    }

}
