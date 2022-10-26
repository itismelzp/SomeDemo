package com.walker.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ101 {


    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            Integer[] nums = new Integer[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }

            int sortType = in.nextInt();
            Arrays.sort(nums, (o1, o2) -> {
                if (sortType == 0) {
                    return o1 - o2;
                } else {
                    return o2 - o1;
                }
            });
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
