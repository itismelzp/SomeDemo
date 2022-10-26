package com.walker.designmode.singleton;

public class LazySingleton {

    private static volatile LazySingleton INSTANCE = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
