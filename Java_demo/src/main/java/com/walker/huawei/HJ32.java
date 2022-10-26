package com.walker.huawei;

import java.util.Scanner;

public class HJ32 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String cipher = in.nextLine();
            System.out.println(longestPalindrome(cipher));
        }
    }

    private static int longestPalindrome(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        dp[0][0] = true;

        int max = 0;
        for (int j = 1; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {               // 1）只有1个元素
                    dp[i][j] = true;
                } else if (j == i + 1) {    // 2）只有2个元素
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                } else {                    // 3）3个元素以上
                    dp[i][j] = s.charAt(j) == s.charAt(i) && dp[i + 1][j - 1];
                }

                // 更新最大长度
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                }
            }
        }
        return max;
    }
}
