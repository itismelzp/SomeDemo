package com.walker.reflect;

import java.lang.reflect.Field;

public class ReflectDemo {


    public static void main(String[] args) {

        MyObject info = new MyObject(1, "info");
        putObject("key", info);
    }


    private static <T> void putObject(String key, T value) {
        Encoder<T> INSTANCE;

        try {
            String canonicalName = value.getClass().getCanonicalName() + "Encoder";
            Class<?> clazz = Class.forName(canonicalName);
            Field creator = clazz.getDeclaredField("INSTANCE");
            creator.setAccessible(true);
            INSTANCE = (Encoder<T>) creator.get(value);

            INSTANCE.tag();

            System.out.println("key: " + key
                    + "\nvalue: " + value.toString()
                    + "\nclazz: " + clazz.toString()
                    + "\nclazz getCanonicalName: " + clazz.getCanonicalName()
                    + "\nclazz getSimpleName: " + clazz.getSimpleName()
                    + "\ncreator: " + creator.toString()
                    + "\nCREATOR: " + INSTANCE.toString()
                    + "\nINSTANCE.tag(): " + INSTANCE.tag()
            );

        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    private static <T> Encoder<T> getINSTANCE(T value, String filedName) {
        Encoder<T> INSTANCE = null;
        try {
            String canonicalName = value.getClass().getCanonicalName() + "Encoder";
            Class<?> clazz = Class.forName(canonicalName);
            Field creator = clazz.getDeclaredField("INSTANCE");
            creator.setAccessible(true);
            INSTANCE = (Encoder<T>) creator.get(value);
        } catch (NoSuchFieldException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return INSTANCE;
    }


}
