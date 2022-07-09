package com.walker.huawei;

import java.util.*;

public class HuaWei {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] input = line.split(" ");
        int[] num = new int[input.length - 1];
        int time = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                time = Integer.parseInt(input[i]);
            } else {
                num[i] = Integer.parseInt(input[i]);
            }
        }

        int speed = 1;
        int tmp = 0;
        for (int i = 0; i < num.length; i++) {
            tmp += (num[i] / speed + 1);
            if (tmp > time) {
                speed++;
                tmp = 0;
                i = 0;
            }
        }
        System.out.println(speed);
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) { // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int n = in.nextInt();
//            int s = in.nextInt();
//            int t = in.nextInt();
//            int m = in.nextInt();
//
//            List<Integer> stones = new ArrayList<>();
//
//            for (int i = 0; i < m; i++) {
//                stones.add(in.nextInt());
//            }
//            Collections.sort(stones);
//
////            System.out.println(crossFlow(stones, n, s, t));
//
//            if (s == t) {
//                singleJudge(s, stones);
//            } else {
//                rangeJudge(s, t, n, stones);
//            }
//        }
//    }
//
//    private static void singleJudge(int s, List<Integer> stones) {
//        int stoneNumber = 0;
//        for (Integer stone : stones) {
//            if (stone % s == 0) {
//                stoneNumber++;
//            }
//        }
//        System.out.println(stoneNumber);
//    }
//
//    private static void rangeJudge(int s, int t, int n, List<Integer> stones) {
//
//        int compressLen = compressBridgeLength(stones, n);
//        int[] dp = new int[compressLen + t + 1];
//        Arrays.fill(dp, 10000);
//        dp[0] = 0;
//        int stoneNumber = 10000;
//        int maxStep = 0;
//        for (int i = s; i <= compressLen + t; i++) {
//            maxStep = Math.max(maxStep, i);
//            for (int j = s; j <= t; j++) {
//                if (i >= j) {
//                    dp[i] = Math.min(dp[i], dp[i - j]);
//                }
//            }
//            if (stones.contains(i)) {
//                dp[i] += 1;
//            }
//        }
//
//        for (int i = compressLen; i <= maxStep; i++) {
//            stoneNumber = Math.min(dp[i], stoneNumber);
//        }
//
//        System.out.println(stoneNumber);
//    }
//
//    private static int compressBridgeLength(List<Integer> stones, int n) {
//        for (int i = 1; i < stones.size(); i++) {
//            int dis = stones.get(i) - stones.get(i - 1);
//            stones.set(i, stones.get(i - 1) + dis % 90);
//        }
//        n = (n - stones.get(stones.size() - 1)) % 90 + stones.get(stones.size() - 1);
//        return n;
//    }
//
//    private static int crossFlow(List<Integer> stones, int n, int s, int t) {
//        int[] vis = new int[n + 1];
//        int[] dp = new int[n + t + 1];
//        for (Integer stone : stones) {
//            vis[stone] = 1;
//        }
//        for (int i = n; i >= 0; i--) {
//            dp[i] = Integer.MAX_VALUE;
//            for (int j = s; j <= t; j++) {
//                dp[i] = Math.min(dp[i], dp[i + j]);
//            }
//            dp[i] += vis[i];
//        }
//        return dp[0];
//    }
}
