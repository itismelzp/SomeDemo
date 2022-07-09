package com.walker.leetcode;

public class No121 {

    public static void main(String[] args) {
        int[] prices = {1, 2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        // 本题就是LeetCode53：最大连续子数组和的变形
        // 7, 1, 5, 3, 6, 4
        //-6, 4,-2, 3,-1,
        int n = prices.length;
        int[] diffs = new int[n];
        // 计算股票连续2天的差价
        for (int i = 1; i < n; i++) {
            diffs[i] = prices[i] - prices[i - 1];
        }

        int[] dp = new int[n];
        int max = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + diffs[i] : diffs[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
