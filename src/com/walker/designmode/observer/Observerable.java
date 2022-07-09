package com.walker.designmode.observer;

public interface Observerable {

    void registerObserver(Observer o);

    void unRegisterObserver(Observer o);

    void notifyObserver();

}
