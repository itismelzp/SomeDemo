package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ103 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            int len = Integer.parseInt(str);
            int[] nums = new int[len];
            String[] split = bf.readLine().split(" ");
            for (int i = 0; i < len; ++i) {
                nums[i] = Integer.parseInt(split[i]);
            }
            System.out.println(lengthOfLIS1(nums));
        }
    }

    private static int lengthOfLIS1(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];

        dp[0] = 1;
        int max = 1;
        for (int i = 1; i < len; i++) {
            int tempMax = 1;
            for (int j = 0; j <= i; j++) {
                if (nums[i] > nums[j]) {
                    tempMax = Math.max(tempMax, dp[j] + 1);
                }
            }
            dp[i] = tempMax;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
