package com.walker.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ08 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息

    public static void main(String[] args) throws Exception {
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();      // 分隔符
        int n = (int) st.nval;   // 强转
//        int[] arr = new int[n];

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            st.nextToken();
            int key = (int) st.nval;
            st.nextToken();
            int value = (int) st.nval;
//            arr[key] = arr[key] + value;
            map.put(key, map.getOrDefault(key, 0) + value);
        }

        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }


//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        // 注意 hasNext 和 hasNextLine 的区别
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        while (in.hasNextInt()) { // 注意 while 处理多个 case
//            int n = in.nextInt();
//            for (int i = 0; i < n; i++) {
//                int idx = in.nextInt();
//                int val = in.nextInt();
//                map.put(idx, map.getOrDefault(idx, 0) + val);
//            }
//            for (Integer i : map.keySet()) {
//                System.out.println(i + " " + map.get(i));
//            }
//        }
//    }
}
