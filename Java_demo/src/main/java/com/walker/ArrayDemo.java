package com.walker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Integer> addList = new ArrayList();
        addList.add(1);
        addList.add(1, 2);
        System.out.println(addList);



        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();


        list.add("test1");
        list.add("test2");
        list.add("test3");

//        System.out.println("list: " + list);
//
//
//        list2 = (ArrayList<String>) list.clone();
//
//        list.remove(1);
//
//        System.out.println("list: " + list);
//        System.out.println("list2: " + list2);
//
//        int a = 8;
//        System.out.println("a=" + a);
//        System.out.println("a>>1=" + (a>>1));
//        System.out.println("a<<1=" + (a<<1));

        System.out.println("---------");

        System.out.println("list:" + list.toString());
        System.out.println(Arrays.toString(list.toArray()));
        String listStr = list.toString().replace("[","").replace("]", "");
        System.out.println(listStr);

        List<String> stringList = Arrays.asList(listStr.split(","));
        System.out.println(stringList);


        System.out.println("------");

        List<Integer> uins = new ArrayList<>();
        uins.add(1321295925);
        uins.add(593859850);
        uins.add(598598500);

//        boolean isGray = (1321295925 % 100) < (1 - 0.5) * 100;
//        System.out.println("isGray：" + isGray);

        for (int uin : uins) {
            System.out.println("uin:" + uin + "(uin % 100):"+(uin % 100)+",isGray：" + ((uin % 100) >= (1 - 1) * 100));
        }

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        for (String s : list3) {
            System.out.println(s);
        }
    }

}
