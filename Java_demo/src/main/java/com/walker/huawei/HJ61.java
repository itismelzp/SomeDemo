package com.walker.huawei;

import java.util.*;

public class HJ61 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(count(m, n));
        }
    }

    private static int count(int m, int n) {
        // 持有i个苹果，有j个盘子可以存放苹果，总共有 dp[i][j]种方法
        int[][] dp = new int[m + 1][n + 1];
        // base case：没有苹果，只有一种摆放方法，可以作为下面递推的终止结果
        for (int j = 0; j <= n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < j) {
                    // 苹果数 < 盘子数，有空盘，
                    // 则忽略一个盘子，在n-1个放苹果，一直递推到n==1，有一种摆法
                    dp[i][j] = dp[i][j - 1];
                } else {
                    // 苹果数 >= 盘子数，可以看作没有空盘
                    // 则可以选择忽略一个盘子，如上边做法
                    // 还可以选择每个盘子放一个苹果，即苹果数剩下i-j,继续递推直到j==1
                    dp[i][j] = dp[i][j - 1] + dp[i - j][j];
                }
            }
        }
        return dp[m][n];
    }

}
