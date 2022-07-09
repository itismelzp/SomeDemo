package com.walker.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int[] nums = new int[str.length-1];
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char ch = str[i].charAt(j);
                if (ch >='0' && ch <='9') {
                    continue;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
            nums[i] = Integer.parseInt(str[i]);
        }

        int H = Integer.parseInt(str[str.length-1]);
        Arrays.sort(nums);
        int left = 1,right = nums[nums.length-1];

        while (left <right) {

        }
    }


}
