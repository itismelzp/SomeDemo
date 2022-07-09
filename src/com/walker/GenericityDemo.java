package com.walker;

import java.util.ArrayList;
import java.util.List;

public class GenericityDemo {


    public static void main(String[] args) {

        List<A> as = new ArrayList<>();
        List<B> bs = new ArrayList<>();
        List<C> cs = new ArrayList<>();

        for (int i=0;i<5;i++) {
            as.add(new A(i));
            bs.add(new B(i));
            cs.add(new C(i));
        }

        System.out.println(getLastView(as));
        System.out.println(getLastView(bs));
        System.out.println(getLastView(cs));
    }

    static class A {
        int id;
        public A(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    static class B {
        int id;
        public B(int id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    static class C {
        int id;
        public C(int id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }


    private static <T> T getLastView(List<T> ss) {
        if (ss != null && !ss.isEmpty()) {
            return ss.get(ss.size() - 1);
        }
        return null;
    }
}
