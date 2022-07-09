package com.walker;

import java.util.ArrayList;
import java.util.List;

public class FeedDateOpDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
//        list.add(1, 5);

//        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("0");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(1);


        List<String> delete =  new ArrayList<>();
        for (Integer integer : list2) {
            delete.add(list1.get(integer));
        }

        list1.removeAll(delete);
        list2.clear();
        System.out.println(list1);
        System.out.println(list2);


        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data(12, "jack"));
        dataList.add(new Data(15, "mike"));
        dataList.add(new Data(15, "mike"));

        System.out.println("dataList:" + dataList);

        List<String> test = new ArrayList<>();

        test.add("1");
        test.add("2");
        test.add("");
        test.add("4");

        for (int i = 0; i < test.size(); i++) {
            if (test.get(i).equals("")) {
                continue;
            }
            System.out.println(test.get(i));
        }

        List<Integer> listInster = new ArrayList<>();
        listInster.add(0, 1);
        System.out.println("listInster: " + listInster);

        List<PoiInfo> poiInfos = new ArrayList<>();
        poiInfos.add(new PoiInfo("Hunan"));

        PoiInfo poiInfo = poiInfos.get(0);
        poiInfo.poiId = "guandong";
        System.out.println("poiInfos:" + poiInfos);
    }

    private static void add(List<Integer> list, int node) {

        list.add(1, node);
    }

    private static class Data {

        public int age;
        public String name;

        Data(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "age: " + age + ", name: " + name;
        }
    }


}
