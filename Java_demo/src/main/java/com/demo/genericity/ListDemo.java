package com.demo.genericity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemo {

    public static void main(String[] args) {

        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

        for (int i = 0; i < arrayList.size(); i++) {
            Object item = null;
            if (arrayList.get(i) instanceof String) {
                item = (String) arrayList.get(i);
            } else if (arrayList.get(i) instanceof Integer) {
                item = (Integer) arrayList.get(i);
            }
            System.out.println("泛型测试: item = " + item);
        }


        List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试: 类型相同");
        }


        GenericityClass<String> genericityClass1 = new GenericityClass<>("1233");
        GenericityClass<Integer> genericityClass2 = new GenericityClass<>(123456);
        System.out.println(genericityClass1.getKey());
        System.out.println(genericityClass2.getKey());


        GenericityClass<Integer> gInteger = new GenericityClass<>(123);
        GenericityClass<Number> gNumber = new GenericityClass<>(456);

        gInteger.showKeyValue1(gInteger);
        gNumber.showKeyValue1(gNumber);

        Class<A> iClass = A.class;
        try {
            A a = GenericityClass.genericMethod(iClass);
            System.out.println("a: " + a);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Object obj = GenericityClass.genericMethod(Class.forName("com.demo.genericity.GenericityClass"));
            System.out.println("obj: " + obj);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}


// 泛型类
// 泛型类，是在实例化类的时候指明泛型的具体类型；泛型方法，是在调用方法的时候指明泛型的具体类型。
class GenericityClass<T> {
    private T key;

    public GenericityClass() {

    }

    public GenericityClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void showKeyValue1(GenericityClass<? extends Number> obj) {
        System.out.println("泛型测试 key value is " + obj.getKey());
    }

    public void showKeyValue2(GenericityClass<? extends A> obj) {
        System.out.println("泛型测试 key value is " + obj.getKey());
    }

    public static <K> K genericMethod(Class<K> tClass) throws InstantiationException, IllegalAccessException {
        return tClass.newInstance();
    }

    public <S extends Number> S showKeyName(GenericityClass<S> container){
        System.out.println("container key :" + container.getKey());
        return container.getKey();
    }

}

class A {

}

class B extends A {

}


// 泛型接口
interface GenericityInterface<T> {
    T next();
}

class VegetableGenerator<T> implements GenericityInterface<T> {

    @Override
    public T next() {
        return null;
    }
}


class FruitGenerator implements GenericityInterface<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}











