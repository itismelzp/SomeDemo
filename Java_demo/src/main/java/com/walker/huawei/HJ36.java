package com.walker.huawei;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HJ36 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine().toUpperCase();
            String s2 = sc.nextLine();
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s2.toCharArray();
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            for (char value : chars1) {
                set.add(value);
            }
            int k = 0;
            while (set.size() < 26) {
                char a = (char) ('A' + k);
                set.add(a);
                k++;
            }
            ArrayList<Character> list = new ArrayList<>(set);
            StringBuilder sb = new StringBuilder();
            for (char value : chars2) {
                if (value == ' ') {
                    sb.append(value);
                } else if (value < 'a') {
                    int n = value - 'A';
                    char c = list.get(n);
                    sb.append(c);
                } else {
                    int n = value - 'a';
                    char c = (char) (list.get(n) + 'a' - 'A');
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }

}
