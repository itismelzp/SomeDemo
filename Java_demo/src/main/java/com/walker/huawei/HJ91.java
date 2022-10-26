package com.walker.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ91 {

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bReader.readLine()) != null) {
            int n = Integer.parseInt(line.substring(0, line.indexOf(" ")));
            int m = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
            System.out.println(getCount(n, m));
        }
    }

    public static int getCount(int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        // 最终加到最后一个点，可能性就是所有的路线数量
        return dp[n][m];
    }
}
