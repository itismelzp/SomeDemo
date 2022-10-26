package com.walker.huawei;

import java.util.Scanner;

public class HJ75 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(findLength(str1.toCharArray(), str2.toCharArray()));
        }
    }

    private static int findLength(char[] nums1, char[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    dp[i + 1][j + 1] = 1 + dp[i][j];
                    res = Math.max(res, dp[i + 1][j + 1]);
                }
            }
        }
        return res;
    }

}
