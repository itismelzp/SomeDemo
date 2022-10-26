package com.walker.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ58 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int k = in.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
            }
            Arrays.sort(num);
            for (int i = 0; i < k; i++) {
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
    }
}
