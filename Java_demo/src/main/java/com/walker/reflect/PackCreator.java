package com.walker.reflect;

public interface PackCreator<T> {
    T decode(long id, String info);
}