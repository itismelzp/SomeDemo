package com.walker.reflect;

public interface Encoder<T> {
    String tag();

    byte[] encode(T obj);

    // bytes is not null (The caller had checked)
    T decode(byte[] bytes, int offset, int length);
}