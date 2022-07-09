package com.walker.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ23 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            int min = Integer.MAX_VALUE;
            for (Integer value : map.values()) {
                if (value < min) {
                    min = value;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (map.get(c) != min) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
