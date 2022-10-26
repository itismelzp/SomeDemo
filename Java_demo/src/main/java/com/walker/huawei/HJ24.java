package com.walker.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ24 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] height = new int[n];
            int[] left = new int[n];

            for (int i = 0; i < n; i++) {
                height[i] = in.nextInt();
            }
            Arrays.fill(left, 1);
            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (height[j] < height[i]) {
                        left[i] = Math.max(left[i], left[j] + 1);
                    }
                }
            }

            int[] right = new int[n];
            Arrays.fill(right, 1);
            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >i; j--) {
                    if (height[j] < height[i]) {
                        right[i] = Math.max(right[i], right[j] + 1);
                    }
                }
            }

            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, left[i] + right[i] - 1);
            }

            System.out.println(n - max);
        }
    }
}
