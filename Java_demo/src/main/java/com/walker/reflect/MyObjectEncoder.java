package com.walker.reflect;


public class MyObjectEncoder implements Encoder<MyObject> {

    public static MyObjectEncoder INSTANCE = new MyObjectEncoder();

    private MyObjectEncoder() {
    }

    @Override
    public String tag() {
        return "MyObjectEncoder";
    }

    @Override
    public byte[] encode(MyObject obj) {
        return new byte[]{};
    }

    @Override
    public MyObject decode( byte[] bytes, int offset, int length) {
        MyObject object = new MyObject();
        PackCreator<MyObject> creator = MyObject.CREATOR;
        return object;
    }

}
