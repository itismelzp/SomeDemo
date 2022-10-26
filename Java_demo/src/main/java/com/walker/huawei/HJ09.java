package com.walker.huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            Set<Integer> set = new HashSet<>();
            int ans = 0;
            while (a != 0) {
                int digit = a % 10;
                a = a / 10;
                if (!set.contains(digit)) {
                    ans = ans * 10 + digit;
                    set.add(digit);
                }
            }
            System.out.println(ans);
        }
    }
}
