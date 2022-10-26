package com.walker.reflect;

public class MyObject {

    long id;
    String info;

    public MyObject() {

    }

    public MyObject(long id, String info) {
        this.id = id;
        this.info = info;
    }

    public static final PackCreator<MyObject> CREATOR = new PackCreator<MyObject>() {

        @Override
        public MyObject decode(long id, String info) {
            return new MyObject(id, info);
        }
    };

    @Override
    public String toString() {
        return "id: " + id + ", info: " + info;
    }
}
