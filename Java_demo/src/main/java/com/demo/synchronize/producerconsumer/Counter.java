package com.demo.synchronize.producerconsumer;

import com.demo.synchronize.ThreadUtil;

import java.util.LinkedList;

/**
 * 柜台
 */
public class Counter {

    private LinkedList<Icecream> listIcecream = new LinkedList<>();
    private final int MAX_COUNT = 10;

    private boolean needWait = true;

    public synchronized void add(Icecream icecream) {
        // 这里要用while不用用if，原因是：多线程情况下，wait被唤醒后需再次确认条件是否还满足
        while (listIcecream.size() >= 10) {
            try {
                System.out.println("柜台放不下了，停止生产冰激凌。" + ThreadUtil.getThreadName());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        listIcecream.add(icecream);
        System.out.println("已经生产出冰激凌了，还有" + listIcecream.size() + "个。" + ThreadUtil.getThreadName());
    }

    public synchronized Icecream take() {
        while (listIcecream.size() <= 0) {
            System.out.println("柜台没有冰激凌了，等着吧。" + ThreadUtil.getThreadName());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Icecream icecream = listIcecream.remove();
        System.out.println("已经消费了，还有 "
                + listIcecream.size() + " 个, 请继续生产。");
        // 需要用notifyAll，可能有多个wait线程，而且可能死琐
        notifyAll();

        return icecream;
    }

}
